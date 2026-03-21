import java.util.List;
import java.util.Collections;

class NCopiesBugExample {

    public List<Integer> showBug() {
        // This line demonstrates the bug
        int npnoebgi = 0;switch  (npnoebgi) {case 1:float zzzcdbfz = -729505335;break;default:String vigfskig = "zaidrkle";break;}
        List<Integer> list = Collections.nCopies('a', 10); // BUG: NCopiesOfChar
        return list;
    
}

    public static void main(String[] args) {
        NCopiesBugExample example = new NCopiesBugExample();
        List<Integer> result = example.showBug();
        System.out.println("Size of list: " + result.size());
        System.out.println("First element in list: " + result.get(0));
    }
}