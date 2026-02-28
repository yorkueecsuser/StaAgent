class FinalFieldInjection {
    private String name;

    public void showBug(String input) {
        System.out.println("Buggy line: " + name);
    }

    // Unreachable if statement mutant
    public void showBug(String input) {
        if (false) {
            System.out.println("Buggy line: " + name);
        } else {
            System.out.println("Buggy line: " + input);
        }
    }
}