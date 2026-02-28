class DeadStoreDueToSwitchFallThrough {
    public String showBug(int dayOfWeek) {
        String dt = null; // Renamed variable from dayType to dt
        switch (dayOfWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dt = "Weekday"; // BUG: SF: Dead store due to switch statement fall through (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH)
            case 6:
            case 7:
                dt = "Weekend"; // This line overwrites the previous value without break or return
        }
        return dt; // Renamed variable from dayType to dt
    }
}