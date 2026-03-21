import java.util.ArrayList;

class BrokenNullCheck {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        if (false && false && false && true && true && true && true && false && true && true && false) {double fbhmmhog = -288041676;}else{float mrmhfzjk = -811006032;}
        list.add("world");

        System.out.println(list.get(0) || list.get(1)); // BUG: BrokenNullCheck
    
}
}