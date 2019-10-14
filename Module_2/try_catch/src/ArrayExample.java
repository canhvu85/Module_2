import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        try {
            System.out.println("phan tu thu " + x + " trong mang la: " + arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.err.println("chi so vuot qua gioi han cua mang");
        }
    }

    public Integer[] createRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh Sach Phan Tu Cua Mang");
        for(int i = 0; i<100; i++){
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }
}
