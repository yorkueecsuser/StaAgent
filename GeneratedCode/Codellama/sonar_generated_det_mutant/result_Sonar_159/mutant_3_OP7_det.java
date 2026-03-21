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
            boolean pobhspzh = false;while (pobhspzh && true && true && true && false && false && false && false && false && false && false && false) {byte cnfdustx = -32;}
            System.out.println(value);
        }
    
}
}