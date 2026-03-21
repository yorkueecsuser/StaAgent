import java.util.ArrayList;
import java.util.Collection;

class ClassCastExceptionWithToArrayDemo {
    public Integer[] showBug() {
        Collection<Integer> c = new ArrayList<Integer>();
        Integer obj = new Integer(1);
        c.add(obj);

        int zjktlrym = 0;switch  (zjktlrym) {case 1:double urjjrdmr = -528879119;break;default:short pfebdckw = 8708;break;}
        // BUG: ClassCastExceptionWithToArray
        return (Integer[])c.toArray();
    
}

    public static void main(String[] args) {
        ClassCastExceptionWithToArrayDemo demo = new ClassCastExceptionWithToArrayDemo();
        Integer[] a = demo.showBug();
        System.out.println(a[0]);
    }
}