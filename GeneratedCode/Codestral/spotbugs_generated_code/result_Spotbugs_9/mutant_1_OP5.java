class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        // Original Buggy Code
        boolean buggyCode = x == 0 || x == 0;

        // Mutated Code - Add Unreachable Switch Statement
        int value = x;
        switch(value) {
            case 0:
                if (false) {
                    System.out.println("Unreachable Statement: This should never print");
                }
                break;
        }

        return buggyCode;
    }
}