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
        int lbzwbirl = 0;switch  (lbzwbirl) {case 1:float rafbiwnh = 791949802;break;default:boolean zeyhnasp = true;break;}
        System.out.println(numbers.get(2));
    
}
}