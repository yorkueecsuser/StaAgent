class BuggyProgram {
    public static void main(String[] args) {
        int[] yakzpwoi = {1, 2, 3, 4, 5};
        int ltaodavq = 0;
        for (int i = 0; i < yakzpwoi.length; i++) {
            ltaodavq += yakzpwoi[i]; // BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
        }
        System.out.println("Sum: " + ltaodavq);
    }
}