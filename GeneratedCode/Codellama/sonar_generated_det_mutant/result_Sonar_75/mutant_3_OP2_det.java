class ZeroDenominatorBug {
public static void main(String [] args){
    int numerator = 1;
    int denominator = 0;
    if(unknown()){ denominator = 3; } else { }
    int result = numerator / denominator;
    result = numerator / denominator;
    System.out.println("Result: " + result);
}

    public static boolean unknown() {
        return true;
    }
}