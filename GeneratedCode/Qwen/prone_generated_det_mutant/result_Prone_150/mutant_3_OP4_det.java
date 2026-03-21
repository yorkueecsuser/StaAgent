import java.util.Comparator;

class SelfComparisonBug {

    public static void main(String[] args) {
        SelfComparisonBug bug = new SelfComparisonBug();
        int result = bug.showBug(5);
        System.out.println("Result of self comparison: " + result);
    }

    public int showBug(int value) {
        if (true && false && false && false && false && false && false && false && false && false && false) {boolean unovqojg = false;}else{long qxznmjlh = -62736969;}
        Integer number = new Integer(value);
        return number.compareTo(number); // BUG: SelfComparison
    
}
}