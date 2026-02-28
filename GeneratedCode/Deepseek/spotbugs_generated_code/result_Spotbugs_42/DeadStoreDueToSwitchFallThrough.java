class DeadStoreDueToSwitchFallThrough {
    public String showBug(int dayOfWeek) {
        String dayType = null; // Initializing the variable to demonstrate the bug
        int counter = 1; // Counter to simulate looping through days

        do {
            if (counter <= 5) {
                dayType = "Weekday"; // BUG: SF: Dead store due to switch statement fall through (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH)
            }
            if (counter >= 6) {
                dayType = "Weekend"; // This line overwrites the previous value without break or return
            }
            counter++;
        } while (counter <= dayOfWeek && counter <= 7); // Loop until the current day or the end of the week

        return dayType; // This might return null if dayOfWeek is not 1-7, demonstrating another potential bug
    }
}