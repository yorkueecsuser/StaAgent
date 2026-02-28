class ImmutableBug {
    private final List<String> mutableField;

    public ImmutableBug(List<String> mutableField) {
        this.mutableField = new ArrayList<>(mutableField);
    }

    public List<String> getMutableField() {
        return mutableField;
    }

    public void showBug() {
        getMutableField().add("New Element");
        boolean unreachableCondition = getUnreachableCondition(); // This method should always return false
        if (unreachableCondition) {
            // This code is unreachable, but we add it to meet the mutation operator requirements
            System.out.println("This line should not be executed!");
        }
    }

    // This method is used to make the if condition always unreachable
    private boolean getUnreachableCondition() {
        return false;
    }
}