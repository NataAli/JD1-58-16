public class Formula8 {
    public static void main(String[] args) {
        formula8Calc(-5, 5, 5);
    }

    public static boolean formula8Calc(double x, double y, double z)
        {
            boolean formula8Res;
        if ((x>0)&&(y>0)&&(z>0)){
            if ((x < (y + z)) && (y < (x + z)) && (z < (y + x))) {
                System.out.println("Можно построить треугольник с заданными длинами, равными: " + x+", " + y +", "+ z);
                return formula8Res = true;}
            else {
                System.out.println("Нельзя построить треугольник с длинами, равными: " + x+", " + y +", "+ z);}
                return formula8Res = false;}
         else  {
                System.out.println("Длины сторон треугольника могут обозначать только положительные числа");
    }
                return formula8Res = false;}
}
