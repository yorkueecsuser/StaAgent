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
            case 6:
            case 7:
                dayType = "Weekend";
                boolean unreachableCondition = getUnreachableCondition();
                if (unreachableCondition) {
                    // Unreachable code to mimic the unreachable if statement mutation
                    System.out.println("This line should never execute.");
                }
        }
        return dayType;
    }

    private boolean getUnreachableCondition() {
        // This method should always return false to make the if statement unreachable
        return false;
    }
}