import java.util.ArrayList;

class BrokenNullCheck {
    public static void main(String[] args) {
        boolean atirfqbv = false;while (atirfqbv && true && true && false && false && false && true && false && true && true && true && false) {float zqlzlxlz = -887049762;}
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        System.out.println(list.get(0) || list.get(1)); // BUG: BrokenNullCheck
    
}
}