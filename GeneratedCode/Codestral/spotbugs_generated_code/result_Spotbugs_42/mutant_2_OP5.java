class DeadStoreDueToSwitchFallThrough {
    public String showBug(int dayOfWeek) {
        String dayType = null;
        boolean unreachableCondition = willNeverHappen();
        switch (dayOfWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Weekday";
            case 6:
            case 7:
                dayType = "Weekend";
        }
        if (unreachableCondition) {
            switch (dayOfWeek) {
                // This switch statement will never be reached due to the condition in the if statement
                default:
                    dayType = "Invalid day";
            }
        }
        return dayType;
    }

    private boolean willNeverHappen() {
        return false;
    }
}