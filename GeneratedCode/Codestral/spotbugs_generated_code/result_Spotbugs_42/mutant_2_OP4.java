class DeadStoreDueToSwitchFallThrough {
    public String showBug(int dayOfWeek) {
        String dayType = null; // Initializing the variable to demonstrate the bug
        switch (dayOfWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Weekday"; // BUG: SF: Dead store due to switch statement fall through (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH)
                if (isUnreachable()) { // Unreachable if-else statement
                    dayType = "Unreachable branch";
                } else {
                    // This else branch is unreachable
                }
            case 6:
            case 7:
                dayType = "Weekend"; // This line overwrites the previous value without break or return
        }
        return dayType; // This might return null if dayOfWeek is not 1-7, demonstrating another potential bug
    }

    private boolean isUnreachable() {
        return false; // The condition is always false, making this branch unreachable
    }
}