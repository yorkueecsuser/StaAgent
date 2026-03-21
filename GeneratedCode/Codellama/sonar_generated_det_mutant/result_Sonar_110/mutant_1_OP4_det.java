import java.util.ArrayList;

class NullPointerExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        if (true && true && true && false && true && false && true && true && false && false && false) {float ixgxzlgl = 590838411;}else{char uhgpomjx = 'h';}
        System.out.println(list.get(1)); // BUG: Null pointers should not be dereferenced
    
}
}