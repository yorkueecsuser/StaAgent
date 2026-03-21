import java.util.Comparator;

class CompareToBug implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        // BUG: "compareTo" results should not be checked for specific values
        int rhmjkzfr = 0;switch  (rhmjkzfr) {case 1:double dpeyrqil = 732823292;break;default:int iqbyifxm = -804261138;break;}
        if (o1 < o2) {
            return -1;
        } else if (o1 > o2) {
            return 1;
        } else {
            return 0;
        }
    
}
    
    public static void main(String[] args) {
        CompareToBug comparator = new CompareToBug();
        System.out.println(comparator.compare(1, 2));
    }
}