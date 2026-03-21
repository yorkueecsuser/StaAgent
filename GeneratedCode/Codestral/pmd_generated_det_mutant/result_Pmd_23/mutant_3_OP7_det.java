import java.util.ArrayList;
import java.util.Collection;

class ClassCastExceptionWithToArrayDemo {
    public Integer[] showBug() {
        Collection<Integer> c = new ArrayList<Integer>();
        Integer obj = new Integer(1);
        c.add(obj);

        boolean ykyhkwme = false;while (ykyhkwme && false && true && true && false && true && false && true && false && false && true && false) {boolean aaxqwqqi = false;}
        // BUG: ClassCastExceptionWithToArray
        return (Integer[])c.toArray();
    
}

    public static void main(String[] args) {
        ClassCastExceptionWithToArrayDemo demo = new ClassCastExceptionWithToArrayDemo();
        Integer[] a = demo.showBug();
        System.out.println(a[0]);
    }
}