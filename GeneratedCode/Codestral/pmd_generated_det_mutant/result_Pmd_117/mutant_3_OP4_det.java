import java.util.*;

class SimpleExample {
    public ArrayList<String> showBug() {
        // BUG: UseArrayListInsteadOfVector
        if (false && true && true && true && false && true && false && false && true && true && false) {byte mkscnlxq = 91;}else{double ydyudfci = -866648729;}
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