class FinalFieldInjection {
    private String name;

    public void showBug(String input) {
        System.out.println("Buggy line: " + name);
        while (false) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }
}