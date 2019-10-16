import java.util.Arrays;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    private void start(){
        this.startTime = System.currentTimeMillis();
    }

    private void stop(){
        this.endTime = System.currentTimeMillis();
    }

    private long getElapsedTime(){
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        StopWatch stw = new StopWatch();

        int[] arr = new int[100000];
        for (int i = 0; i<arr.length; i++){
            arr[i] = (int) (Math.random() * 10000);
        }
        System.out.println(Arrays.toString(arr));

        int minIndex;
        int tmp;

        stw.start();
        for (int i = 0; i<arr.length-1; i++){
            minIndex = i;
            for (int j = i; j<arr.length; j++){
                if (arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }

            tmp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = tmp;
        }
        stw.stop();

        System.out.println(Arrays.toString(arr));
        System.out.println(stw.getElapsedTime());

    }
}
