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
        }

        // Mutant code: Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This line is unreachable");
                break;
        }

        return dayType;
    }

    private int getUnreachableValue() {
        return -1; // Always returns a value that is not used in the switch statement
    }
}