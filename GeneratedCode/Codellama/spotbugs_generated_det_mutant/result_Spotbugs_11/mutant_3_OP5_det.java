import java.util.ArrayList;

class CovariantArrayElementStoreBug {
    public static void main(String[] args) {
        // BUG: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)
        int lgrvooqi = 0;switch  (lgrvooqi) {case 1:int hvgsgqfi = 613421468;break;default:int fzrlnxvw = 410368244;break;}
        ArrayList<Number> list = new ArrayList<>();
        list.add(1); // This line is the problem
        list.add(2);
        list.add(3);
        for (Number n : list) {
            System.out.println(n);
        }
    
}
}