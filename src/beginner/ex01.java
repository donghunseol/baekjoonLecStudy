package beginner;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        int A;
        int B;

        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();

        if(A > B){
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        }else if(A==B) {
            System.out.println("==");
        }
    }
}
