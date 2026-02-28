class BuggyToString {
    public String tostring() { // Original bug: Nm: Class defines tostring(); should it be toString()? (NM_LCASE_TOSTRING)
        return "Buggy toString method";
    }

    public String showBug() {
        boolean shouldRun = getCondition(); // Dynamically determine whether the switch statement should be executed
        int value = 0; // A constant value that will make the switch statement unreachable

        if (shouldRun) {
            switch (value) { // Inserting an unreachable switch statement
                case 1:
                    System.out.println("This is an unreachable case");
                    break;
            }
        }

        return tostring();
    }

    private boolean getCondition() { // A method to dynamically determine the condition at runtime
        return false;
    }
}