class SelfEqualsBug {

    public boolean showBug() {
        String str = "example";
        return str.equals(str); // BUG: SelfEquals

        // Introduced Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is an unreachable case.");
                break;
            default:
                // Default case will execute instead
                System.out.println("This is the default case.");
                break;
        }
    }

    private boolean getCondition() {
        // This method returns false, making the switch condition always evaluate to 1
        return false;
    }

    public static void main(String[] args) {
        SelfEqualsBug bugDemo = new SelfEqualsBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}