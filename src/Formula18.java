import java.util.Locale;
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class Formula18 {


    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);

        double x1 = readDoublefromConsole("Ввведите x1:");
        double y1 = readDoublefromConsole("Ввведите y1:");
        double x2 = readDoublefromConsole("Ввведите x2:");
        double y2 = readDoublefromConsole("Ввведите y2:");
        double d1 = sqrt(sqrt(x1)+sqrt(y1));
        double d2 = sqrt(sqrt(x2)+sqrt(y2));

        if (d1<d2){
            System.out.println("Точка с координатами ("+x1+","+y1+") ближе к началу координат, чем ("+x2+", "+y2+")");
        }
        else {
            System.out.println("Точка с координатами ("+x2+"+,"+y2+") ближе к началу координат, чем ("+x1+", "+y1+")");

        }
    }
    private static double readDoublefromConsole(String invite){
        double i = 0;
        Scanner consmess = new Scanner(System.in);
        System.out.print(invite);
        while(consmess.hasNext()){
            if (consmess.hasNextDouble()){
                i = consmess.nextDouble();
                break;
            }
            else {
                consmess.next();
                System.out.println(invite);
            }
        };
        return i;
    }
}