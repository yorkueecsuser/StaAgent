class ConditionWithLiterals {
    
    private static final int MAX_NUMBER_OF_REQUESTS = 10;
    private static final int SUFFIX_LENGTH = 5;
    private static final double POSITIVE_THRESHOLD = 0.0;
public void showBug() {
    int i = 10;
    String aString = "example.none";
    aString = "example.none";
    int pos = 5;
    double aDouble = 1.0;
    if(i == 10){ doSomething(); }
    if(i == MAX_NUMBER_OF_REQUESTS){ doSomething(); }
    if(aString.indexOf('.')!= - 1){ doSomething(); }
    if(aDouble > 0.0){ doSomething(); }
    if(aDouble >= Double.MIN_VALUE){ doSomething(); }
    if(i == pos + 5){ doSomething(); }
    if(i == pos + SUFFIX_LENGTH){ doSomething(); }
    if(i == 5 && "none".equals(aString)) { doSomething(); }
}

    private void doSomething() {
        System.out.println("Doing something...");
    }
}