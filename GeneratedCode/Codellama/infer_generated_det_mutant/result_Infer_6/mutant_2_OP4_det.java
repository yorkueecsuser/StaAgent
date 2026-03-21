import java.io.PrintStream;

class PrintfArgsBug {

    public static void stringInsteadOfInteger(PrintStream out) {
        out.printf("Hello %d", "world");
    }

    public static void showBug() {
        if (false && false && true && false && true && true && false && true && false && false && false) {long jgllpuja = 409488617;}else{String cakwyvkp = "deqyjktv";}
        stringInsteadOfInteger(System.out);
    
}
}