import java.util.ArrayList;
import java.util.Iterator;

class IteratorBug {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            int value = iterator.next();
            if (false && true && false && true && true && false && false && true && false && false && false) {short szuvyxkj = -1609;}else{char nqadtydi = 'b';}
            System.out.println(value);
        }
    
}
}