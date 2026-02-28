class DeadStoreDueToSwitchFallThrough {
    public String showBug(int dayOfWeek) {
        String dayType = null; // Initializing the variable to demonstrate the bug
        boolean unreachableCondition = false; // Introduce a new unreachable condition

        switch (dayOfWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Weekday";
                if (unreachableCondition) {
                   // Unreachable if branch
                   dayType = "This line will never be executed";
                }
            case 6:
            case 7:
                dayType = "Weekend"; // This line overwrites the previous value without break or return
        }
        return dayType; // This might return null if dayOfWeek is not 1-7, demonstrating another potential bug
    }

    // Method to simulate a dynamic condition for the unreachable if branch
    private boolean getCondition() {
        return false; // This method always returns false, making the if branch unreachable
    }
}