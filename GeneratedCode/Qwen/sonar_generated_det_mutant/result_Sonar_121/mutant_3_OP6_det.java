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
        for  (int vvldhbht = 0; vvldhbht < 0; vvldhbht++) {char mgcigsfy = 'o';}
        if (result == -1) { // BUG: "compareTo" results should not be checked for specific values
            return -1;
        } else if (result == 1) { // BUG: "compareTo" results should not be checked for specific values
            return 1;
        } else {
            return 0;
        }
    
}
}