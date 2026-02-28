class DeadStoreDueToSwitchFallThrough {
    public String showBug(int dayOfWeek) {
        String dayType = null;
        int i = dayOfWeek;
        do {
            if (i >= 1 && i <= 5) {
                dayType = "Weekday";
            }
            if (i >= 6 && i <= 7) {
                dayType = "Weekend";
            }
            i++;
        } while (i <= 7); // this ensures the loop runs for all possible values of dayOfWeek
        return dayType;
    }
}