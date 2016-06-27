public class Formula1 {
    public static void main(String[] args) {
       double x = 8;
       double Formula1Result = calcFormula1(x);
       System.out.println("При x равном " + x + ", результатом выражения x - x^3/3 + x^5/5, будет " + Formula1Result);
    }
    public static double calcFormula1(double x) {
        double Formula1Result = x - (Math.pow(x, 3))/3 + (Math.pow(x, 5))/5;
        return Formula1Result;
    }
}
