import java.util.ArrayList;

class BrokenNullCheck {
    public static void main(String[] args) {
        double vfbvindp = -800437244;
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        System.out.println(list.get(0) || list.get(1)); // BUG: BrokenNullCheck
    
}
}