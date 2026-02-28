import java.math.BigDecimal;

class BuggyBigDecimal {
    public BigDecimal showBug() {
        BigDecimal bd = new BigDecimal(0.1);
        BigDecimal bdDuplicate = new BigDecimal(0.1); // Mutated Code: Duplicated assignment statement
        return bd;
    }

    public static void main(String[] args) {
        BuggyBigDecimal buggyBigDecimal = new BuggyBigDecimal();
        System.out.println(buggyBigDecimal.showBug());
    }
}