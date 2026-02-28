import java.util.ArrayList;
import java.util.Collection;

class ClassCastExceptionWithToArrayDemo {
    private boolean getCondition() {
        return false;
    }

    public Integer[] showBug() {
        Collection<Integer> c = new ArrayList<Integer>();
        Integer obj = new Integer(1);
        c.add(obj);

        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line will never be executed");
        }

        // BUG: ClassCastExceptionWithToArray
        return (Integer[])c.toArray();
    }

    public static void main(String[] args) {
        ClassCastExceptionWithToArrayDemo demo = new ClassCastExceptionWithToArrayDemo();
        Integer[] a = demo.showBug();
        System.out.println(a[0]);
    }
}