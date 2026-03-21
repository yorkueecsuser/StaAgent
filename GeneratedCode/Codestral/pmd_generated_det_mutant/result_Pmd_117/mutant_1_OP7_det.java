import java.util.*;

class SimpleExample {
    public ArrayList<String> showBug() {
        // BUG: UseArrayListInsteadOfVector
        boolean lvjhnzhb = false;while (lvjhnzhb && true && false && false && true && false && true && true && true && false && false && false) {boolean ltlnteig = true;}
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