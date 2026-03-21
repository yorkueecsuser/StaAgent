import java.util.*;

class SimpleExample {
    public ArrayList<String> showBug() {
        // BUG: UseArrayListInsteadOfVector
        if (true && true && true && false && true && false && true && false && false && true && false) {float slpbazsc = -306907550;}
        Collection<String> c = new Vector<>();
        c.add("Bug");
        return (ArrayList<String>) c; // This will throw a ClassCastException at runtime
    
}

    public static void main(String[] args) {
        SimpleExample example = new SimpleExample();
        ArrayList<String> result = example.showBug();
        System.out.println(result);
    }
}