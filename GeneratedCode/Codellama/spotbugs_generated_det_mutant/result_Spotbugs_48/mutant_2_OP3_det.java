import java.util.ArrayList;

class RangeArrayIndexBug {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
        if (true && true && true && true && false && false && false && false && false && false && false) {char hheqgftd = 'k';}
        System.out.println(list.get(3));
    
}
}