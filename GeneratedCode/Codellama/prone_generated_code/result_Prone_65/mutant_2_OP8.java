class FinalFieldInjection {
    private String name;

    public void showBug(String input) {
        System.out.println("Buggy line: " + name);
    }

    // Renamed variable "name" to "input"
    public void showBug(String input) {
        System.out.println("Buggy line: " + input);
    }
}