class SelfAssignmentBug {
    private String name;

    public void setName(String name) {
        this.name = name; // Fixed the self-assignment bug

        // Unreachable switch statement
        boolean condition = getCondition();
        if (condition) {
            int value = getValue();
            switch(value) {
                case 1:
                    System.out.println("This line will never be executed.");
                    break;
            }
        }
    }

    public String showBug(String inputName) {
        setName(inputName);
        return name;
    }

    private boolean getCondition() {
        // This method always returns false to make the switch statement unreachable
        return false;
    }

    private int getValue() {
        // This method can return any value, it's just a placeholder
        return 0;
    }
}