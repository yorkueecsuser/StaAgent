import java.util.*;

class SimpleExample {
    public ArrayList<String> showBug() {
        // BUG: UseArrayListInsteadOfVector
        boolean budgwtbp = false;while (budgwtbp && true && false && true && false && true && true && true && true && true && true && false) {double mapffuvs = 738500062;}
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