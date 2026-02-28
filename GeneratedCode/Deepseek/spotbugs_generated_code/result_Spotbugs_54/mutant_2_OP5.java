class CompareToBug {
    public String showBug(Integer a, Integer b) {
        if (a.compareTo(b) == 1) {
            return "a is greater than b";
        } else if (a.compareTo(b) == -1) {
            return "a is less than b";
        } else {
            boolean unreachableCondition = false;
            switch (unreachableCondition) { // Mutant: Unreachable switch statement
                case true:
                    System.out.println("This code should never be executed");
                    break;
            }
            return "a and b are equal";
        }
    }
}