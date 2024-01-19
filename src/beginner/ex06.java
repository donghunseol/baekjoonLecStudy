package beginner;

import java.io.*;

public class ex06 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int []nums = new int[3];
        int save;
        try {
            String num = br.readLine();
            String[] result = num.split(" ");

            for(String a:result){
                nums = new int[]{Integer.parseInt(a)};
            }

            for (int i = 0; i < nums.length; i++) {
                if(i == 0){
                    continue;
                }

                if(nums[i-1] < nums[i]){
                    save = nums[i-1];
                    nums[i-1] = nums[i];
                    nums[i] = save;
                    i = 0;
                }
            }

            for(int a:nums){
                System.out.println(a);
            }

            bw.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
