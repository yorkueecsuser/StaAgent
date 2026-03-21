import java.util.List;
import java.util.Collections;

class NCopiesBugExample {

    public List<Integer> showBug() {
        // This line demonstrates the bug
        for  (int pjhpfvkk = 0; pjhpfvkk < 0; pjhpfvkk++) {double xitkzipr = 136211115;}
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