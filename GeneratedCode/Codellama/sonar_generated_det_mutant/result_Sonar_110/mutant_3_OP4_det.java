import java.util.ArrayList;

class NullPointerExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        if (true && true && true && true && true && true && true && true && true && true && false) {long syudathz = -809937753;}else{double gfgvsoff = -11303029;}
        System.out.println(list.get(1)); // BUG: Null pointers should not be dereferenced
    
}
}