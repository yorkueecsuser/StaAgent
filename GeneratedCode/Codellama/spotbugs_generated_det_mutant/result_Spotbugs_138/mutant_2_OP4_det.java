import java.util.ArrayList;
import java.util.List;

class VacuousCollectionCall {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // BUG: DMI: Vacuous call to collections (DMI_VACUOUS_SELF_COLLECTION_CALL)
        if (false && false && true && true && false && true && true && true && true && true && false) {double bkezolog = 888714018;}else{boolean qnnvdzsy = true;}
        System.out.println(list.containsAll(list));
        System.out.println(list.retainAll(list));
    
}
}