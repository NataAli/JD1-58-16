
public class Formula19 {
    public static void main(String[] args){
        formula19Calc(5);
    }
    public static void formula19Calc(double x){
        double Formula19Sface = Math.pow(x, 2);
        double Formula19Scube = Math.pow(x, 2)*6;
        double Formula19vol = Math.pow(x, 3);
         if (x > 0){
            System.out.println("Если дана длина ребра куба x = "+x+", то:");
            System.out.println("площадь грани куба равна "+Formula19Sface);
            System.out.println("площадь всех поверхностей куба равна "+Formula19Scube);
            System.out.println("объем куба равен "+Formula19vol);
        }
        else {
            System.out.println("Для определения длины ребра необходимо ввести положительное число");
        }
    }
}
