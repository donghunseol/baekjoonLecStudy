package beginner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex05 {
    public static void main(String[] args) {
        int N;
        int result;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            N = Integer.parseInt(br.readLine());

            if(N > 0 && N<=100000){
                for (int i = 0; i < N; i++) {
                    result = N - i;
                    bw.write(result+"\n");
                }
            }
            bw.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
