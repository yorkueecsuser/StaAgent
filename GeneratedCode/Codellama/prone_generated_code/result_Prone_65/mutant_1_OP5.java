class FinalFieldInjection {
    private String name;

    public void showBug(String input) {
        System.out.println("Buggy line: " + name);
    }

    // Unreachable switch statement mutant
    public void showBugMutant(String input) {
        switch (input.length()) {
            case 0:
                System.out.println("The input is empty");
                break;
            case 1:
                System.out.println("The input is a single character");
                break;
            default:
                System.out.println("The input is a string");
                break;
        }
    }
}