import java.util.Random;

class RandomValueBug {
public int showBug() {
    Random random = new Random();
    double randomValue = random.nextDouble();
    int coercedValue =(int)randomValue;
    coercedValue =(int)randomValue;
    return coercedValue;
}

    public static void main(String[] args) {
        RandomValueBug bugDemo = new RandomValueBug();
        int result = bugDemo.showBug();
        System.out.println("The coerced integer value is: " + result);
    }
}