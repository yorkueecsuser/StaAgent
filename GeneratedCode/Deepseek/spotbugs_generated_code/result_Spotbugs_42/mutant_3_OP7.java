class DeadStoreDueToSwitchFallThrough {
    public String showBug(int dayOfWeek) {
        String dayType = null;
        switch (dayOfWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Weekday";
                boolean conditionWhile = getCondition();
                while (conditionWhile) {
                    // This line is never executed
                    int i = 0;
                    i++;
                }
            case 6:
            case 7:
                dayType = "Weekend";
        }
        return dayType;
    }

    private boolean getCondition() {
        return false; // This method is used to avoid using 'false' directly
    }
}