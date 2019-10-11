import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = scanner.nextInt();

        String str = "";
        String str1 = "";
        String str2 = "";
        String str3 = "";

        int hundreds;
        if(n>100 && n<1000) {
            hundreds = n / 100;
            switch (hundreds) {
                case 1:
                    str += "one hundred and ";
                    break;
                case 2:
                    str += "two hundred and ";
                    break;
                case 3:
                    str += "three hundred and ";
                    break;
                case 4:
                    str += "four hundred and ";
                    break;
                case 5:
                    str += "five hundred and ";
                    break;
                case 6:
                    str += "six hundred and ";
                    break;
                case 7:
                    str += "seven hundred and ";
                    break;
                case 8:
                    str += "eight hundred and ";
                    break;
                case 9:
                    str += "nine hundred and ";
                    break;
            }
            n = n % 100;
        }
        int dozens;
        int unit;

        if(n > 0 && n<=10){

            switch (n){
                case 1 : str+= "one";
                        break;
                case 2 : str+= "two";
                        break;
                case 3 : str+= "three";
                    break;
                case 4 : str+= "four";
                    break;
                case 5 : str+= "five";
                    break;
                case 6 : str+= "six";
                    break;
                case 7 : str+= "seven";
                    break;
                case 8 : str+= "eight";
                    break;
                case 9 : str+= "nine";
                    break;
                case 10 : str+= "ten";
                    break;
            }
        }else if (n <= 20){
            switch (n % 10){
                case 1 : str+= "eleven";
                    break;
                case 2 : str+= "twelve";
                    break;
                case 3 : str+= "thirteen";
                    break;
                case 4 : str+= "fourteen";
                    break;
                case 5 : str+= "fifteen";
                    break;
                case 6 : str+= "sixteen";
                    break;
                case 7 : str+= "seventeen";
                    break;
                case 8 : str+= "eighteen";
                    break;
                case 9 : str+= "nineteen";
                    break;
                case 0 : str+= "twenty";
                    break;
            }
        }else if (n < 100){
            dozens = n/10 ;
            unit = n % 10;
            switch (dozens){

                case 2 : str+= "twenty ";
                    break;
                case 3 : str+= "thirty";
                    break;
                case 4 : str+= "forty ";
                    break;
                case 5 : str+= "fifty ";
                    break;
                case 6 : str+= "sixty ";
                    break;
                case 7 : str+= "seventy ";
                    break;
                case 8 : str+= "eighty ";
                    break;
                case 9 : str+= "ninety ";
                    break;

            }

            switch (unit){
                case 1 : str+= "one ";
                    break;
                case 2 : str+= "two ";
                    break;
                case 3 : str+= "three ";
                    break;
                case 4 : str+= "four ";
                    break;
                case 5 : str+= "five ";
                    break;
                case 6 : str+= "six ";
                    break;
                case 7 : str+= "seven ";
                    break;
                case 8 : str+= "eight ";
                    break;
                case 9 : str+= "nine ";
                    break;

            }
        }
        System.out.println(str);
    }
}
