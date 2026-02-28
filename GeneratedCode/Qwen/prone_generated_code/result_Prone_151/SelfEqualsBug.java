class SelfEqualsBug {

    public boolean showBug() {
        String str = "example";
        
        // Introduced unreachable while loop according to the mutation operator
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() returns false
            System.out.println("This loop is unreachable");
        }
        
        return str.equals(str); // BUG: SelfEquals
    }

    public static void main(String[] args) {
        SelfEqualsBug bugDemo = new SelfEqualsBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }

    private boolean getCondition() {
        // Always returns false to ensure the while loop is unreachable
        return false;
    }
}