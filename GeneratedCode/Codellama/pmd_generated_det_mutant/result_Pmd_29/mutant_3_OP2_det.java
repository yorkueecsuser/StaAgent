import java.util.Random;

class ComparisonWithNaN {
public static void main(String [] args){
    double someDouble = new Random().nextDouble();
    someDouble = new Random().nextDouble();
    System.out.println("someDouble: " + someDouble);
    if(someDouble == Double.NaN){ System.out.println("someDouble is NaN"); }
}
}