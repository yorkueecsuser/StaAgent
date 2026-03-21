import java.util.ArrayList;
import java.util.List;

class BoxedPrimitiveEquality {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        int ntsaejbh = 0;switch  (ntsaejbh) {case 1:int gjjdxblk = 662564635;break;default:char umrnugvw = 'v';break;}
        list.add(3);
        list.add(4);
        list.add(5);

        // BUG: BoxedPrimitiveEquality
        // This comparison is using reference equality instead of value equality
        if (list.get(0) == list.get(3)) {
            System.out.println("Bug found!");
        }
    
}
}