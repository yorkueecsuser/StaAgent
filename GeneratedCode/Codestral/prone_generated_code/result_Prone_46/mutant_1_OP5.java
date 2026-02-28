class EqualsNullBug {
    private String value;

    public EqualsNullBug(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (value.equals(null)) { // BUG: EqualsNull
            return true;
        }
        if (!(obj instanceof EqualsNullBug)) {
            return false;
        }
        EqualsNullBug other = (EqualsNullBug) obj;

        // Mutation: Unreachable switch statement
        int unreachableValue = getUnreachableValue(); // Dynamically determined value
        switch (unreachableValue) {
            case 1:
                // Unreachable code
                System.out.println("This code should never execute.");
                break;
        }

        return value.equals(other.value);
    }

    private int getUnreachableValue() {
        // Implementation to dynamically determine the unreachable value
        // For the purpose of demonstrating the mutation, this method always returns 0
        return 0;
    }

    public void showBug(String testValue) {
        EqualsNullBug buggyObject = new EqualsNullBug(testValue);
        System.out.println(buggyObject.equals(null));
    }

    public static void main(String[] args) {
        EqualsNullBug buggyObject = new EqualsNullBug("test");
        buggyObject.showBug(null);
    }
}