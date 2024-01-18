package beginner;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int result = Integer.valueOf(num, 16);
        System.out.println(result);
    }
}
