class UnrelatedTypesComparison {
    public boolean getFalseCondition() {
        return false; // This method is used to ensure the switch statement is unreachable
    }

    public boolean showBug(Object obj, String str) {
        int value = (obj == str)? 1 : 0; // Preserving the original bug
        boolean condition = getFalseCondition();

        if (condition) {
            return true;
        } else {
            switch (value) { // Inserting unreachable switch statement
                case 1:
                    System.out.println("This line should never be executed");
                    break;
                default:
                    break;
            }
            return false;
        }
    }
}