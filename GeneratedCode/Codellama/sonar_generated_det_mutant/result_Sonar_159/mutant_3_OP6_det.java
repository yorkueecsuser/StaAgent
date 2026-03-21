import java.util.ArrayList;
import java.util.Iterator;

class IteratorBug {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();

        for  (int vlrfnllq = 0; vlrfnllq < 0; vlrfnllq++) {char xngskolo = 'j';}
        while (iterator.hasNext()) {
            int value = iterator.next();
            System.out.println(value);
        }
    
}
}