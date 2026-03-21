class DeadStoreDueToSwitchFallThrough {
    public String showBug(int dayOfWeek) {
        String hrkbhgtd = null; // Initializing the variable to demonstrate the bug
        switch (dayOfWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                hrkbhgtd = "Weekday"; // BUG: SF: Dead store due to switch statement fall through (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH)
            case 6:
            case 7:
                hrkbhgtd = "Weekend"; // This line overwrites the previous value without break or return
        }
        return hrkbhgtd; // This might return null if dayOfWeek is not 1-7, demonstrating another potential bug
    }
}