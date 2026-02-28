class CompareToBug {
    public String showBug(Integer a, Integer b) {
        if (a.compareTo(b) == 1) {
            return "a is greater than b";
        } else if (a.compareTo(b) == 1) { // Mutant: Duplication of the check for specific return value of 1
            return "a is greater than b";
        } else if (a.compareTo(b) == -1) {
            return "a is less than b";
        } else {
            return "a and b are equal";
        }
    }
}