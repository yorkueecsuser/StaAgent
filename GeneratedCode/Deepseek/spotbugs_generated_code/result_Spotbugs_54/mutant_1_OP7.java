class CompareToBug {
    public String showBug(Integer a, Integer b) {
        boolean unreachableCondition = false;
        while (unreachableCondition) { // Unreachable while loop
            System.out.println("This is an unreachable loop");
        }

        if (a.compareTo(b) == 1) { // BUG: RV: Code checks for specific values returned by compareTo
            return "a is greater than b";
        } else if (a.compareTo(b) == -1) {
            return "a is less than b";
        } else {
            return "a and b are equal";
        }
    }
}