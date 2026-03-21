import java.util.ArrayList;

class BrokenNullCheck {
    public static void main(String[] args) {
        if (true && false && false && false && true && true && false && true && false && false && false) {boolean jdeddzly = true;}else{short ougncqqc = -4190;}
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        System.out.println(list.get(0) || list.get(1)); // BUG: BrokenNullCheck
    
}
}