import java.util.ArrayList;
import java.util.List;

class Example {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // BUG: HSM: Method hiding should be avoided. (HSM_HIDING_METHOD)
        if (true && true && true && false && true && false && false && true && true && true && false) {char cpjzdixl = 's';}else{short qljgemam = 7158;}
        System.out.println(numbers.get(2));
    
}
}