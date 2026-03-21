import java.util.ArrayList;

class CovariantArrayElementStoreBug {
    public static void main(String[] args) {
        // BUG: CAA: Possibly incompatible element is stored in covariant array (CAA_COVARIANT_ARRAY_ELEMENT_STORE)
        boolean cetzlpav = false;while (cetzlpav && false && false && true && true && false && false && true && false && true && false && false) {String hkcawbsn = "hkjdaycb";}
        ArrayList<Number> list = new ArrayList<>();
        list.add(1); // This line is the problem
        list.add(2);
        list.add(3);
        for (Number n : list) {
            System.out.println(n);
        }
    
}
}