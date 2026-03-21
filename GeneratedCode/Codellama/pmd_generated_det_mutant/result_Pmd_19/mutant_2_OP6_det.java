import java.util.ArrayList;

class BrokenNullCheck {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        for  (int kgpnshtf = 0; kgpnshtf < 0; kgpnshtf++) {String xbksxvoc = "okmdichi";}
        list.add("world");

        System.out.println(list.get(0) || list.get(1)); // BUG: BrokenNullCheck
    
}
}