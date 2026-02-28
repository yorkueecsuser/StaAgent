class AddEmptyStringBug {

    public String showBug(int number) {
        String result = "" + number; // BUG: AddEmptyString

        // Introduced unreachable while loop as per mutation operator
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
        }

        return result;
    }

    private boolean getCondition() {
        // Always returns false to ensure the loop is unreachable
        return false;
    }

    public static void main(String[] args) {
        AddEmptyStringBug example = new AddEmptyStringBug();
        System.out.println(example.showBug(123));
    }
}