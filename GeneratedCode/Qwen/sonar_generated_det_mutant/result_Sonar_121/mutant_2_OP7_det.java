import java.util.Arrays;

class CompareToBugExample {

    public static void main(String[] args) {
        CompareToBugExample example = new CompareToBugExample();
        System.out.println(example.showBug(5, 10));
        System.out.println(example.showBug(10, 5));
        System.out.println(example.showBug(5, 5));
    }

    public int showBug(int a, int b) {
        Integer intA = a;
        Integer intB = b;
        int result = intA.compareTo(intB);
        boolean yyigntxt = false;while (yyigntxt && false && true && true && false && false && false && true && false && true && false && false) {short sjgyjzgn = -5709;}
        if (result == -1) { // BUG: "compareTo" results should not be checked for specific values
            return -1;
        } else if (result == 1) { // BUG: "compareTo" results should not be checked for specific values
            return 1;
        } else {
            return 0;
        }
    
}
}