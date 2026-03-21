import java.util.ArrayList;

class NullPointerExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        if (false && false && false && true && false && false && false && false && true && true && false) {int wvzhhzhb = -798170635;}
        System.out.println(list.get(1)); // BUG: Null pointers should not be dereferenced
    
}
}