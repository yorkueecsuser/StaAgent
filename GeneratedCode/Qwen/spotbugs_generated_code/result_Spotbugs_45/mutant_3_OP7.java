class NullFieldExample {

    private String nullableField = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public NullFieldExample() {
        this.nullableField = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)
        
        // Inserting unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
            nullableField = "This will never be executed";
        }
    }

    public String showBug() {
        return nullableField; // This will always return null due to the bug
    }

    public static void main(String[] args) {
        NullFieldExample example = new NullFieldExample();
        System.out.println("The value of nullableField is: " + example.showBug());
    }

    private boolean getCondition() {
        // This method always returns false, making the while loop unreachable
        return false;
    }
}