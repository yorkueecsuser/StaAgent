class CompareToBug {
    public String showBug(Integer a, Integer b) {
        if (a.compareTo(b) == 1) {
            int comparisonResult = a.compareTo(b); // Duplicate the assignment statement
            return "a is greater than b";
        } else if (a.compareTo(b) == -1) {
            int comparisonResult = a.compareTo(b); // Duplicate the assignment statement
            return "a is less than b";
        } else {
            int comparisonResult = a.compareTo(b); // Duplicate the assignment statement
            return "a and b are equal";
        }
    }
}