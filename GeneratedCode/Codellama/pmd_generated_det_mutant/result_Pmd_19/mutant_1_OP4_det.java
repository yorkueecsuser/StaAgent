import java.util.ArrayList;

class BrokenNullCheck {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        if (false && true && false && false && true && false && false && true && true && false && false) {float lnjxyxhs = -79254091;}else{boolean iaqvriuk = true;}
        System.out.println(list.get(0) || list.get(1)); // BUG: BrokenNullCheck
    
}
}