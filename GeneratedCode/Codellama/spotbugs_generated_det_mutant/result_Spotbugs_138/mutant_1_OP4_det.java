import java.util.ArrayList;
import java.util.List;

class VacuousCollectionCall {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // BUG: DMI: Vacuous call to collections (DMI_VACUOUS_SELF_COLLECTION_CALL)
        if (true && false && true && true && true && false && false && true && false && false && false) {byte gkbbqhus = -126;}else{long limeodfm = 650452824;}
        System.out.println(list.containsAll(list));
        System.out.println(list.retainAll(list));
    
}
}