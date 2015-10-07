/**
 * Created by bezIDar on 07.10.2015.
 */
public class Calculate {

    public double sum(double x, double y){
        return x + y;
    }

    public double minus(double x, double y){
        return x - y;
    }

    public double mult(double x, double y){
        return x * y;
    }

    public double diff (double x, double y){
        if(y != 0){ x = x / y; }

        else{ System.out.println("We cant divide by zero");}
        return x;
    }

    public double pow(double x, double y){
        return Math.pow(x, y);
    }

}
