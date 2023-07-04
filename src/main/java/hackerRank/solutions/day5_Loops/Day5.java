package hackerRank.solutions.day5_Loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day5 {

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            bufferedReader.close();

            for (int i = 1; i< 11; i++){
                //  Java int do string
                String xN = n + "";
                String xI = i + "";
                System.out.println(xN + " x " + xI + " = " + (n*i));
            }
        }
    }
}
