import java.util.ArrayList;
import java.util.Iterator;

class IteratorBug {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean cavwtntm = false;while (cavwtntm && false && true && true && true && false && true && false && false && false && false && false) {byte ewrojcid = 29;}
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            int value = iterator.next();
            System.out.println(value);
        }
    
}
}