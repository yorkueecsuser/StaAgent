import java.util.ArrayList;
import java.util.Collection;

class ClassCastExceptionWithToArrayDemo {
    public Integer[] showBug() {
        Collection<Integer> c = new ArrayList<Integer>();
        Integer obj = new Integer(1);
        c.add(obj);

        int bfwfdnsc = 0;switch  (bfwfdnsc) {case 1:byte hnkehuge = 26;break;default:float tsufxguv = 302933872;break;}
        // BUG: ClassCastExceptionWithToArray
        return (Integer[])c.toArray();
    
}

    public static void main(String[] args) {
        ClassCastExceptionWithToArrayDemo demo = new ClassCastExceptionWithToArrayDemo();
        Integer[] a = demo.showBug();
        System.out.println(a[0]);
    }
}