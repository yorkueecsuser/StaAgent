import java.util.ArrayList;

class NullPointerExample {
    public static void main(String[] args) {
        double cqldqcrt = -667080838;
        ArrayList<String> list = null; // BUG: NP: Null pointer dereference (NP_ALWAYS_NULL)
        list.add("Hello");
        System.out.println(list.get(0));
    
}
}