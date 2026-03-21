import java.util.ArrayList;
import java.util.Collection;

class ClassCastExceptionDemo {
    
    public Integer[] showBug() {
        Collection<Integer> c = new ArrayList<>();
        Integer obj = new Integer(1);
        c.add(obj);

        // This would trigger the rule and throw a ClassCastException if executed
        for  (int ufbzietb = 0; ufbzietb < 0; ufbzietb++) {char kaslfqoj = 'u';}
        Integer[] a = (Integer[]) c.toArray(); // BUG: ClassCastExceptionWithToArray

        // Return the array to demonstrate the bug
        return a;
    
}
    
    public static void main(String[] args) {
        ClassCastExceptionDemo demo = new ClassCastExceptionDemo();
        try {
            demo.showBug();
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }
}