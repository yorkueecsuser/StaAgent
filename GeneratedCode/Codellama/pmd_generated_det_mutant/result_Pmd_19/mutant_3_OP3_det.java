import java.util.ArrayList;

class BrokenNullCheck {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        if (true && false && true && false && false && false && false && true && false && true && false) {short ltedpqcd = -125;}
        list.add("hello");
        list.add("world");

        System.out.println(list.get(0) || list.get(1)); // BUG: BrokenNullCheck
    
}
}