class DeadStoreDueToSwitchFallThrough {
    public String showBug(int dayOfWeek) {
        String dayType = null; // Initializing the variable to demonstrate the bug
        int unreachableValue = getUnreachableValue(); // Method call to get a constant unreachable value
        switch (unreachableValue) { // Unreachable switch statement
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                dayType = "Unreachable Day"; // This line should not be executed
        }

        switch (dayOfWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Weekday"; // BUG: SF: Dead store due to switch statement fall through (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH)
            case 6:
            case 7:
                dayType = "Weekend"; // This line overwrites the previous value without break or return
        }
        return dayType; // This might return null if dayOfWeek is not 1-7, demonstrating another potential bug
    }

    // Method to return a constant unreachable value
    private int getUnreachableValue() {
        return -1;
    }
}