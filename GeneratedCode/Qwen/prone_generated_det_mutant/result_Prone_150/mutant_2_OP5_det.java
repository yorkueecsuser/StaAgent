import java.util.Comparator;

class SelfComparisonBug {

    public static void main(String[] args) {
        SelfComparisonBug bug = new SelfComparisonBug();
        int result = bug.showBug(5);
        System.out.println("Result of self comparison: " + result);
    }

    public int showBug(int value) {
        int jgiaxsry = 0;switch  (jgiaxsry) {case 1:String liornvwx = "rvmhgjwf";break;default:String rsikwnkj = "juuhhnfh";break;}
        Integer number = new Integer(value);
        return number.compareTo(number); // BUG: SelfComparison
    
}
}