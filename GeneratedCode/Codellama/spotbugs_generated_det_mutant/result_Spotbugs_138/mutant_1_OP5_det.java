import java.util.ArrayList;
import java.util.List;

class VacuousCollectionCall {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // BUG: DMI: Vacuous call to collections (DMI_VACUOUS_SELF_COLLECTION_CALL)
        int lysflcxd = 0;switch  (lysflcxd) {case 1:char zjgltiiv = 'k';break;default:char vlygdnwv = 'z';break;}
        System.out.println(list.containsAll(list));
        System.out.println(list.retainAll(list));
    
}
}