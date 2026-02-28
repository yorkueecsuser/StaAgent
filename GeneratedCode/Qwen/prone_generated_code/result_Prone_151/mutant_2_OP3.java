class SelfEqualsBug {

    public boolean showBug() {
        String str = "example";
        return str.equals(str); // BUG: SelfEquals

        // Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable statement.");
        }
    }

    private boolean getCondition() {
        // This method will always return false, making the if statement unreachable
        return false;
    }

    public static void main(String[] args) {
        SelfEqualsBug bugDemo = new SelfEqualsBug();
        System.out.println("Result of showBug: " + bugDemo.showBug());
    }
}