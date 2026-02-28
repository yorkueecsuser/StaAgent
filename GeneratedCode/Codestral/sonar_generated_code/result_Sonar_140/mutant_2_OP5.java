class BuggyCode {
    public int showBug() {
        int i = 0;
        int j = 0;

        i = i++;

        // Mutant code: Inserting unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                // This code will never be executed
                System.out.println("Unreachable code executed");
                break;
        }

        return j++;
    }

    private int getUnreachableValue() {
        // This method always returns a value that is not 1, making the switch statement unreachable
        return 0;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        System.out.println(buggyCode.showBug());
    }
}