import java.util.ArrayList;

class NullPointerExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        for  (int nkfgwild = 0; nkfgwild < 0; nkfgwild++) {byte pkrcusow = 98;}
        System.out.println(list.get(1)); // BUG: Null pointers should not be dereferenced
    
}
}