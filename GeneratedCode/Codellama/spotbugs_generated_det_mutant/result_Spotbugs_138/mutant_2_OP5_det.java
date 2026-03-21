import java.util.ArrayList;
import java.util.List;

class VacuousCollectionCall {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // BUG: DMI: Vacuous call to collections (DMI_VACUOUS_SELF_COLLECTION_CALL)
        int bsvsplxx = 0;switch  (bsvsplxx) {case 1:char ibmkdubq = 'e';break;default:int jicjhlcl = -847140636;break;}
        System.out.println(list.containsAll(list));
        System.out.println(list.retainAll(list));
    
}
}