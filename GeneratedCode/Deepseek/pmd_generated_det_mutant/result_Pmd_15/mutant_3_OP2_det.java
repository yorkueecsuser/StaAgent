import java.util.Random;

class BugDemo {
    private static final int MAX_NUMBER_OF_REQUESTS = 10;
    private static final double MIN_DOUBLE_VALUE = Double.MIN_VALUE;
    private static final int SUFFIX_LENGTH = 5;
public int showBug() {
    Random rand = new Random();
    int i = rand.nextInt(20);
    int pos = rand.nextInt(10);
    pos = rand.nextInt(10);
    double aDouble = rand.nextDouble();
    String aString = Integer.toString(rand.nextInt(20));
    int buggyLineNumber = 0;
    if(i == 10){ buggyLineNumber = 20; doSomething(); }
    if(i == MAX_NUMBER_OF_REQUESTS){ doSomething(); }
    if(aString.indexOf('.')!= - 1){ }
    if(aString.indexOf('.')>= 0){ }
    if(aDouble > 0.0){ }
    if(aDouble >= MIN_DOUBLE_VALUE){ }
    if(i == pos + 5){ buggyLineNumber = 36; }
    if(i == pos + SUFFIX_LENGTH){ }
    if(i == 5 && "none".equals(aString)) { buggyLineNumber = 43; }
    return buggyLineNumber;
}

    private void doSomething() {
        // implementation
    }
}