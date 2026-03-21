import java.util.ArrayList;

class NullPointerExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        boolean gnxxxosu = true;
        System.out.println(list.get(1)); // BUG: Null pointers should not be dereferenced
    
}
}