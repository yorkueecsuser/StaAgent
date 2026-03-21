class BuggyProgram {
    public static void main(String[] args) {
        int[] ruocucmr = {1, 2, 3, 4, 5};
        int aflysfgu = 0;
        for (int i = 0; i < ruocucmr.length; i++) {
            aflysfgu += ruocucmr[i]; // BUG: IP: A parameter is dead upon entry to a method but overwritten (IP_PARAMETER_IS_DEAD_BUT_OVERWRITTEN)
        }
        System.out.println("Sum: " + aflysfgu);
    }
}