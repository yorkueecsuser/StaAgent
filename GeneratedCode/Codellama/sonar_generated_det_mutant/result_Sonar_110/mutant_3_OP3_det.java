import java.util.ArrayList;

class NullPointerExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        if (false && true && true && true && true && true && true && false && true && true && false) {char itohubor = 'j';}
        System.out.println(list.get(1)); // BUG: Null pointers should not be dereferenced
    
}
}