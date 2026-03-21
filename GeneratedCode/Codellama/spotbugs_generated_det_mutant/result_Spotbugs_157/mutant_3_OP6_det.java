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
        for  (int oqplwxau = 0; oqplwxau < 0; oqplwxau++) {long hbeqfpsy = -311947030;}
        System.out.println(numbers.get(2));
    
}
}