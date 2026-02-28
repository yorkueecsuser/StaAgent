class CompareToBug {
    public String showBug(Integer a, Integer b) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This code will never be executed");
        }
        else {
            if (a.compareTo(b) == 1) {
                return "a is greater than b";
            } else if (a.compareTo(b) == -1) {
                return "a is less than b";
            } else {
                return "a and b are equal";
            }
        }
    }
}