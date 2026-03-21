import java.util.ArrayList;
import java.util.Iterator;

class IteratorBug {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        int pdviehfb = 0;switch  (pdviehfb) {case 1:short djrscynb = 3155;break;default:short liacnvph = 7764;break;}
        list.add(3);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            int value = iterator.next();
            System.out.println(value);
        }
    
}
}