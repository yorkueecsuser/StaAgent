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
        int xsieatfi = intA.compareTo(intB);
        if (xsieatfi == -1) { // BUG: "compareTo" xsieatfis should not be checked for specific values
            return -1;
        } else if (xsieatfi == 1) { // BUG: "compareTo" xsieatfis should not be checked for specific values
            return 1;
        } else {
            return 0;
        }
    }
}