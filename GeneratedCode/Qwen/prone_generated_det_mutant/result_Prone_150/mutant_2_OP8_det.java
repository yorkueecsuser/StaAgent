import java.util.Comparator;

class SelfComparisonBug {

    public static void main(String[] args) {
        SelfComparisonBug bug = new SelfComparisonBug();
        int kfxsuizn = bug.showBug(5);
        System.out.println("Result of self comparison: " + kfxsuizn);
    }

    public int showBug(int value) {
        Integer number = new Integer(value);
        return number.compareTo(number); // BUG: SelfComparison
    }
}