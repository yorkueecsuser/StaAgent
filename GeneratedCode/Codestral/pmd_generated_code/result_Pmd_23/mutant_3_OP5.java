import java.util.ArrayList;
import java.util.Collection;

class ClassCastExceptionWithToArrayDemo {
    public Integer[] showBug() {
        Collection<Integer> c = new ArrayList<Integer>();
        Integer obj = new Integer(1);
        c.add(obj);

        int value = getValue();
        switch(value) {
            case 1:
                // This case is unreachable since getValue() will never return 1
                System.out.println("Unreachable code");
                break;
        }

        // BUG: ClassCastExceptionWithToArray
        return (Integer[])c.toArray();
    }

    private int getValue() {
        // This method is designed so that it never returns 1
        return 2;
    }

    public static void main(String[] args) {
        ClassCastExceptionWithToArrayDemo demo = new ClassCastExceptionWithToArrayDemo();
        Integer[] a = demo.showBug();
        System.out.println(a[0]);
    }
}