class BuggyProgram {
    public static void main(String[] args) {
        int[] wwqvkaah = {1, 2, 3, 4, 5};
        int awvxjkoo = 0;
        for (int i = 0; i < wwqvkaah.length; i++) {
            awvxjkoo += wwqvkaah[i]; // BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
        }
        System.out.println("Sum: " + awvxjkoo);
    }
}