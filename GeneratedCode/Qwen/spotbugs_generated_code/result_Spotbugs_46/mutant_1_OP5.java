class UnwrittenFieldExample {

    private int unwrittenField; // BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)

    public int showBug() {
        boolean condition = getCondition();
        switch (condition? 0 : 1) { // Unreachable switch statement
            case 0:
                System.out.println("This is unreachable code.");
                break;
            case 1:
                // This case is always taken
                break;
        }
        return unwrittenField;
    }

    private boolean getCondition() {
        return false; // This method ensures the switch condition is dynamically determined
    }

    public static void main(String[] args) {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        System.out.println("Value of unwrittenField: " + example.showBug());
    }
}