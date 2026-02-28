class AddEmptyStringBug {

    public String showBug(int number) {
        String result = "" + number; // BUG: AddEmptyString

        // Unreachable for loop mutation
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always false
        }

        return result;
    }

    private boolean getCondition() {
        return false; // This method returns false, making the loop condition always false
    }

    public static void main(String[] args) {
        AddEmptyStringBug example = new AddEmptyStringBug();
        System.out.println(example.showBug(123));
    }
}