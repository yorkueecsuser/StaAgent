import java.util.Comparator;

class SelfComparisonBug {

    public static void main(String[] args) {
        SelfComparisonBug bug = new SelfComparisonBug();
        int result = bug.showBug(5);
        System.out.println("Result of self comparison: " + result);
    }

    public int showBug(int value) {
        if (true && true && true && false && false && false && false && false && false && true && false) {char svtmbaxx = 'y';}else{long kjocmsnu = -791134441;}
        Integer number = new Integer(value);
        return number.compareTo(number); // BUG: SelfComparison
    
}
}