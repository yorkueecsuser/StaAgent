class AddEmptyStringBug {

    public String showBug(int number) {
        String result = "" + number; // BUG: AddEmptyString

        // Introduced an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is never true
                result += "Unreachable";
                break;
            case 1:
                // This case is always executed
                result += "Reachable";
                break;
        }

        return result;
    }

    private boolean getCondition() {
        // This method always returns false, making the first case of the switch unreachable
        return false;
    }

    public static void main(String[] args) {
        AddEmptyStringBug example = new AddEmptyStringBug();
        System.out.println(example.showBug(123));
    }
}