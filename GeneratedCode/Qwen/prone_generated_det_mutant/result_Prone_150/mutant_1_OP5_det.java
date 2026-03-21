import java.util.Comparator;

class SelfComparisonBug {

    public static void main(String[] args) {
        SelfComparisonBug bug = new SelfComparisonBug();
        int result = bug.showBug(5);
        System.out.println("Result of self comparison: " + result);
    }

    public int showBug(int value) {
        int orgiiyiy = 0;switch  (orgiiyiy) {case 1:String lwpxkopv = "pdszjeww";break;default:byte tmmhuxzw = 83;break;}
        Integer number = new Integer(value);
        return number.compareTo(number); // BUG: SelfComparison
    
}
}