import java.util.Comparator;

class CompareToBug implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        // BUG: "compareTo" results should not be checked for specific values
        if (true && true && false && true && false && false && false && false && true && true && false) {char yxnjytco = 'a';}else{String jazldaxf = "dyknuduj";}
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