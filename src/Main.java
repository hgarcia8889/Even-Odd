import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
Scanner sc = new Scanner(System.in);

        System.out.println("Please enter an integer: ");

        int num = sc.nextInt();
        System.out.println();

        if( num % 2 == 0){
            System.out.println("This number is even!");
        }
        else if( num % 2 == 1){
            System.out.println("This number is odd!");
        }
        else{
            System.out.println("Invalid response!");
        }
    }

}