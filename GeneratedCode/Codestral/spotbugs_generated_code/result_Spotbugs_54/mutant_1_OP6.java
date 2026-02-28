class CompareToBug {
    public String showBug(Integer a, Integer b) {
        boolean conditionFor = false; // Condition for the unreachable for loop
        if (a.compareTo(b) == 1) {
            for (int i = 0; conditionFor; i++) { // Unreachable for loop
                System.out.println("This is an unreachable loop");
            }
            return "a is greater than b";
        } else if (a.compareTo(b) == -1) {
            return "a is less than b";
        } else {
            return "a and b are equal";
        }
    }
}