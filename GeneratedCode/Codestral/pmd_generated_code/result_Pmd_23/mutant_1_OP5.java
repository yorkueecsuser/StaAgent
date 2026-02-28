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

        if (getCondition()) {
            int value = 1; // this value will never be used
            switch (value) {
                case 1:
                    System.out.println("This line will never be executed.");
                    break;
            }
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