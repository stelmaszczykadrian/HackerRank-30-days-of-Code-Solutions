package hackerRank.solutions.day2;

public class Day2 {
    public void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost * tip_percent / 100;
        double tax = meal_cost * tax_percent / 100;
        int totalCost = (int) Math.round(meal_cost + tip + tax);

        System.out.println(totalCost);
    }
}
