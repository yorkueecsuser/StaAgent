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
        int mzcdvlzn = 0;switch  (mzcdvlzn) {case 1:float cegjtrgf = 380906180;break;default:float jccvijyh = 452342702;break;}
        if (result == -1) { // BUG: "compareTo" results should not be checked for specific values
            return -1;
        } else if (result == 1) { // BUG: "compareTo" results should not be checked for specific values
            return 1;
        } else {
            return 0;
        }
    
}
}