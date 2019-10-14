import java.util.Scanner;

public class SearchArray {

    public static void main(String[] args) {
        String[]  students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Name");
        String name = scanner.nextLine();

        boolean isExist = false;

        for (int i = 0; i<students.length; i++){
            if (students[i].equals(name)){
                System.out.println("Position the student" + name + "in the list: " + (i+1));
                isExist = true;
                break;
            }
        }

        if(!isExist){
            System.out.println(name + " not found in the list");
        }
    }
}
