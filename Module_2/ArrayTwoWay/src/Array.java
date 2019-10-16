public class Array {
    public static int max;
    public static void main(String[] args) {
        int[][] arr = new int[5][5] ;
        for (int i = 0; i< 5; i++){
            for(int j = 0; j<5; j++){
                arr[i][j] = (int) (Math.random()*100 + 1);
            }
        }

        displayArray(arr);
        int[] position;
        position = findMax(arr);
        System.out.println("The Max of array is: "+ max + " at position: " + position[0] + " - " + position[1] );
    }

    public static void displayArray(int[][] arr){
        for (int i = 0; i< 5; i++){
            for(int j = 0; j<5; j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static int[] findMax(int[][] arr){
        int[] position = new int[2] ;
        max = arr[0][0];
        for (int i = 0; i< 5; i++){
            for(int j = 0; j<5; j++){
                if (max<arr[i][j]){
                    max = arr[i][j];
                    position[0] = i;
                    position[1] = j;
                }
            }
        }
        return position;
    }

}
