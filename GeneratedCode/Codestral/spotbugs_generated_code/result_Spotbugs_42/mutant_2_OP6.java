class DeadStoreDueToSwitchFallThrough {
    private boolean getCondition() {
        return false;
    }

    public String showBug(int dayOfWeek) {
        String dayType = null;
        boolean condition = getCondition();
        switch (dayOfWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Weekday";
                if (condition) {
                    for (int i = 0; i < 10; i++) {
                        // Unreachable for loop as per the mutation operator
                        System.out.println("Unreachable loop iteration: " + i);
                    }
                }
            case 6:
            case 7:
                dayType = "Weekend";
        }
        return dayType;
    }
}