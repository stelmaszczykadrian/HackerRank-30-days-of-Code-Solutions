package hackerRank.solutions.day1_DataTypes;

import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int i2 = scan.nextInt();
        double d2 = scan.nextDouble();
        scan.nextLine();

        String s2 = scan.nextLine();

        System.out.println(i + i2);
        System.out.println(d + d2);
        System.out.println(s.concat(s2));

    }
}
