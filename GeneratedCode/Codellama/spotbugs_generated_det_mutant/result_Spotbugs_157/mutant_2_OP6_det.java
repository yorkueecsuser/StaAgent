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
        for  (int nagmkryg = 0; nagmkryg < 0; nagmkryg++) {short dvtusiup = -2472;}
        System.out.println(numbers.get(2));
    
}
}