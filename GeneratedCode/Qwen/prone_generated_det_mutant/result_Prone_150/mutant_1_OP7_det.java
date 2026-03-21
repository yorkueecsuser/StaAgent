import java.util.Comparator;

class SelfComparisonBug {

    public static void main(String[] args) {
        SelfComparisonBug bug = new SelfComparisonBug();
        int result = bug.showBug(5);
        System.out.println("Result of self comparison: " + result);
    }

    public int showBug(int value) {
        boolean nncailvd = false;while (nncailvd && false && false && true && false && true && true && true && false && false && false && false) {double cfwkzied = -102936317;}
        Integer number = new Integer(value);
        return number.compareTo(number); // BUG: SelfComparison
    
}
}