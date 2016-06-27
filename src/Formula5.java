public class Formula5 {
      public static void main(String[] args){
          form5Calc(1, 2, 1);
        }

        public static void form5Calc(double a, double b, double c) {
            double d, x1, x2;
            d = Math.pow(b, 2) - (4 * a * c);
            if (d>0){
                x1 = ((-1) * b + Math.sqrt(d)) / (2 * a);
                x2 = ((-1) * b - Math.sqrt(d)) / (2 * a);
                System.out.println("Корнями квадратного уравнения " + a + "x^2 +" + b + "x+" + c + " являются " + x1 + " и " + x2);
            }
            else if (d == 0){
                x1 = x2 = ((-1) * b)/(2*a);
                System.out.println("Корнями квадратного уравнения " + a + "x^2 +" + b + "x+" + c + " являются x1, x2 = "+ x1);
            }
            else {
                System.out.println("Квадратное уравнение " + a + "x^2 + " + b + "x + " + c + " корней не имеет. Дискриминант меньше нуля");
            }
        }
    }