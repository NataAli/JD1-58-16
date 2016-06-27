public class Formula7 {
    public static void main (String[] args) {
        formula7Calc(-3, -3, -2, -2, 2);
    }
    public static void formula7Calc(double x, double y, double x0, double y0, double r){
    boolean Formula7Res;
        if ((Math.pow((x-x0),2) + Math.pow((y-y0), 2))<(Math.pow(r,2))) {
            System.out.println(Formula7Res = true);
        }
        else {
         System.out.println(Formula7Res = false);
        }
    }
}
