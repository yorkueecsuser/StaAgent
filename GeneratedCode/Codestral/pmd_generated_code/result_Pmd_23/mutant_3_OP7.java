import java.util.ArrayList;
import java.util.Collection;

class ClassCastExceptionWithToArrayDemo {
    public Integer[] showBug() {
        Collection<Integer> c = new ArrayList<Integer>();
        Integer obj = new Integer(1);
        c.add(obj);

        // Added unreachable while loop
        boolean condition = getCondition();
        while(condition) {
            // This loop is unreachable
        }

        // BUG: ClassCastExceptionWithToArray
        return (Integer[])c.toArray();
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ClassCastExceptionWithToArrayDemo demo = new ClassCastExceptionWithToArrayDemo();
        Integer[] a = demo.showBug();
        System.out.println(a[0]);
    }
}