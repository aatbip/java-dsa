package ananta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number");
        System.out.println(input.nextInt());
        System.out.println("Enter Text");
        System.out.println(input.next());
        System.out.println(input.nextLine());
    }
}
