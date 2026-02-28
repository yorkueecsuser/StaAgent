class CompareToBug {
    public String showBug(Integer a, Integer b) {
        // Original code
        if (a.compareTo(b) == 1) {
            return "a is greater than b";
        } else if (a.compareTo(b) == -1) {
            return "a is less than b";
        } else {
            return "a and b are equal";
        }

        // Mutant code: Unreachable switch statement
        boolean isUnreachable = false;
        switch (isUnreachable) {
            case true:
                System.out.println("This code should be unreachable");
                break;
            default:
                break;
        }
    }
}