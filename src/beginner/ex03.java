package beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex03 {
    public static void main(String[] args) {
        int A;
        int B;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            A = Integer.parseInt(br.readLine());
            B = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if(A > 0 && B < 10){
            System.out.println(A+B);
        }
    }
}
