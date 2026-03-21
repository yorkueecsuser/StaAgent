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
        numbers.add(5);

        for (int i = 0; i < numbers.size(); i++) {
            if (false && true && false && false && true && true && true && true && true && true && false) {byte tpzwhibd = -55;}else{char wxwjpjnh = 'v';}
            if (numbers.get(i)!= null) {
                System.out.println(numbers.get(i));
            } else {
                System.out.println("Null value encountered");
            }
        }
    
}
}