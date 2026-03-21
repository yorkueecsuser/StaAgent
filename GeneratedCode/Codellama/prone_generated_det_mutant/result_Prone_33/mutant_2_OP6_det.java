import java.util.*;

class DereferenceWithNullBranch {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(null);
        for  (int llsnnwgv = 0; llsnnwgv < 0; llsnnwgv++) {double iwarigdp = 727294339;}
        numbers.add(5);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)!= null) {
                System.out.println(numbers.get(i));
            } else {
                System.out.println("Null value encountered");
            }
        }
    
}
}