package hackerRank.solutions.day3_Intro_To_Conditional_Statements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day3 {
    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            bufferedReader.close();

            if (isEven(n) && (n > 20 || (n >= 2 && n <= 5))) {
                System.out.println("Not Weird");
            } else {
                System.out.println("Weird");
            }
        }

        private static boolean isEven(int n) {
            return n % 2 == 0;
        }
    }

}
