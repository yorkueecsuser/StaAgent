import java.util.ArrayList;
import java.util.Iterator;

class IteratorBug {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        if (false && true && true && true && false && false && false && false && true && false && false) {char cleautjs = 'x';}else{short temwgjkk = 8285;}
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            int value = iterator.next();
            System.out.println(value);
        }
    
}
}