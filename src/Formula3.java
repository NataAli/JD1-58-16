public class Formula3 {
    public static void main (String[] args) {
        int x = 874584;
        int Formula3Result = calcFormula3(x);
        if (Math.abs(x)>999 && Math.abs(x)<10001) {
            System.out.println("Произведение цифр числа "+x+" равно "+Formula3Result);
        }
        else {
            System.out.println("Необходимо ввести четырехзначное число");
        }
    }
    public static int calcFormula3(int x){
        int digit1 = (x/1000)%10;
        int digit2 = x/100 %10;
        int digit3 = (x/10)%10;
        int digit4 = x%10;
        int Formula3Result = digit1 * digit2 * digit3 * digit4;
        return Formula3Result;
    }
}
