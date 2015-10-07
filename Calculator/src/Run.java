import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bezIDar on 07.10.2015.
 */
public class Run {

    public static void main(String[] args) throws IOException{
        Calculate calc = new Calculate();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter variables");

        double x = Integer.parseInt(reader.readLine());
        double y = Integer.parseInt(reader.readLine());

        System.out.println("x plus y equals: " + calc.sum(x, y));
        System.out.println("x minus y equals: " + calc.minus(x, y));
        System.out.println("x multiple by y equals: " + calc.mult(x, y));
        System.out.println("x divided by y equals: " + calc.diff(x, y));
        System.out.println("x in power of y equals: " + calc.pow(x, y));
    }
}
