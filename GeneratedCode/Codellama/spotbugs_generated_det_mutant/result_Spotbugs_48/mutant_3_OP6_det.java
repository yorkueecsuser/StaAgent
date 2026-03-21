import java.util.ArrayList;

class RangeArrayIndexBug {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
        for  (int mhvjmspd = 0; mhvjmspd < 0; mhvjmspd++) {short ximnavbp = -5719;}
        System.out.println(list.get(3));
    
}
}