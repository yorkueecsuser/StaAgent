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
                // Mutant code starts here
                boolean shouldRun = getCondition();
                if (shouldRun) {
                    System.out.println("This branch is unreachable");
                } else {
                    System.out.println("This is the else part of the unreachable branch");
                }
                // Mutant code ends here
        }
        return dayType;
    }

    // A helper method to generate a false condition
    private boolean getCondition() {
        return false;
    }
}