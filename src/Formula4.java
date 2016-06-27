public class Formula4 {
    public static void main (String[] args) {
       formula4Calc(5, 8);
    }

    public static void formula4Calc(double x, double y){
        double Formula4sum = x + y;
        double Formula4subst = x - y;
        double Formula4mult = x * y;
        double Formula4div = x/y;
        if (y == 0){
            System.out.println("Если даны числа x = "+x+" и y = "+y+", то:");
            System.out.println("их сумма равна "+Formula4sum);
            System.out.println("их разность равна "+Formula4subst);
            System.out.println("их произведение равно "+Formula4mult);
            System.out.println("их частное невозможно вычислить: делить на 0 нельзя");
        }
        else {
            System.out.println("Если даны числа x = " + x + " и y =" + y + ", то:");
            System.out.println("их сумма равна " + Formula4sum);
            System.out.println("их разность равна " + Formula4subst);
            System.out.println("их произведение равно " + Formula4mult);
            System.out.println("их частное равно " + Formula4div);
        }
    }
}
