import java.util.ArrayList;

class RangeArrayIndexBug {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
        if (false && false && true && true && true && false && true && false && false && false && false) {long kohywxeb = -952187790;}else{short ecwgmrvt = 6851;}
        System.out.println(list.get(3));
    
}
}