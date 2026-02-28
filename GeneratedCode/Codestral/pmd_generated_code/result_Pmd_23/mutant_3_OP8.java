import java.util.ArrayList;
import java.util.Collection;

class ClassCastExceptionWithToArrayDemo {
    public Integer[] showBug() {
        Collection<Integer> coll = new ArrayList<Integer>();
        Integer obj = new Integer(1);
        coll.add(obj);

        // BUG: ClassCastExceptionWithToArray
        return (Integer[])coll.toArray();
    }

    public static void main(String[] args) {
        ClassCastExceptionWithToArrayDemo demo = new ClassCastExceptionWithToArrayDemo();
        Integer[] array = demo.showBug();
        System.out.println(array[0]);
    }
}