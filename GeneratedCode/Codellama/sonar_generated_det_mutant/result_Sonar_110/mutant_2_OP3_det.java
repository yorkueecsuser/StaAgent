import java.util.ArrayList;

class NullPointerExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        if (true && true && true && false && false && true && false && false && true && true && false) {long dlepmpvq = -131316038;}
        System.out.println(list.get(1)); // BUG: Null pointers should not be dereferenced
    
}
}