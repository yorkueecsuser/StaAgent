import java.util.ArrayList;

class BrokenNullCheck {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        boolean ymvivdos = false;while (ymvivdos && true && false && true && true && false && true && false && false && false && true && false) {char apouiauc = 'q';}
        System.out.println(list.get(0) || list.get(1)); // BUG: BrokenNullCheck
    
}
}