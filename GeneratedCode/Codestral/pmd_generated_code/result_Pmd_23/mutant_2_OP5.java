import java.util.ArrayList;
import java.util.Collection;

class ClassCastExceptionWithToArrayDemo {
    public Integer[] showBug() {
        Collection<Integer> c = new ArrayList<Integer>();
        Integer obj = new Integer(1);
        c.add(obj);

        // Adding unreachable switch statement
        boolean unreachableCondition = getUnreachableCondition();
        switch (unreachableCondition) {
            case true:  // This case will never be executed
                System.out.println("This is an unreachable block");
                break;
        }

        // BUG: ClassCastExceptionWithToArray
        return (Integer[])c.toArray();
    }

    private static boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        ClassCastExceptionWithToArrayDemo demo = new ClassCastExceptionWithToArrayDemo();
        Integer[] a = demo.showBug();
        System.out.println(a[0]);
    }
}