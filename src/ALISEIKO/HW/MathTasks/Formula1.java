package ALISEIKO.HW.MathTasks;

public class Formula1 {
    public static void main(String[] args) {
        formula1Calc(6);
    }

        public static void formula1Calc(double x) {
        double Formula1Result = x - (Math.pow(x, 3))/3 + (Math.pow(x, 5))/5;
        System.out.println("При x равном " + x + ", результатом выражения x - x^3/3 + x^5/5, будет " + Formula1Result);
    }
}
