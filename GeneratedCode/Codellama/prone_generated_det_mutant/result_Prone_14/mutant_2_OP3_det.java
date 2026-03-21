import java.util.ArrayList;
import java.util.List;

class BoxedPrimitiveEquality {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        if (true && false && true && true && false && true && false && true && true && true && false) {int fhsmfszx = 888124319;}
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // BUG: BoxedPrimitiveEquality
        // This comparison is using reference equality instead of value equality
        if (list.get(0) == list.get(3)) {
            System.out.println("Bug found!");
        }
    
}
}