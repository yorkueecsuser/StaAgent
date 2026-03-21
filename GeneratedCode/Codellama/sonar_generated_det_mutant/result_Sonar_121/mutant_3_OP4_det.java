import java.util.Comparator;

class CompareToBug implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        // BUG: "compareTo" results should not be checked for specific values
        if (false && false && true && false && true && true && true && true && true && false && false) {float rcwzxjha = -502998525;}else{short meeyzlws = -3594;}
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