import java.util.ArrayList;

class BrokenNullCheck {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        boolean kxyacfbn = false;while (kxyacfbn && true && true && false && false && true && false && true && false && false && true && false) {boolean jcwhysvu = false;}
        list.add("world");

        System.out.println(list.get(0) || list.get(1)); // BUG: BrokenNullCheck
    
}
}