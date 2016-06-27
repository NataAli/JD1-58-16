public class Formula2 {
    public static void main(String[] args) {
        double x = 75;
        double y = 878;
        double Formula2Result = calcFormula2(x, y);
        System.out.println("При x, равном " + x + ", и y, равном " + y + ", результатом выражения ((1 + sin^(x+y))/(2 + |x - 2x/(1 + x^2y^2)|) + x, будет " + Formula2Result);
    }
    public static double calcFormula2(double x, double y) {
    double Formula2Result = ((1 + Math.pow(Math.sin(x+y), 2))/(2 + Math.abs(x - (2 * x) / (1 + (Math.pow(x, 2) * Math.pow(y, 2)))))) + x;
    return Formula2Result;
    }
}