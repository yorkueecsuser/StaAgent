class DeadStoreDueToSwitchFallThrough {
    public String showBug(int dayOfWeek) {
        String typeOfDay = null; // Renamed dayType to typeOfDay
        switch (dayOfWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                typeOfDay = "Weekday"; // BUG: SF: Dead store due to switch statement fall through (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH)
            case 6:
            case 7:
                typeOfDay = "Weekend"; // This line overwrites the previous value without break or return
        }
        return typeOfDay; // This might return null if dayOfWeek is not 1-7, demonstrating another potential bug
    }
}