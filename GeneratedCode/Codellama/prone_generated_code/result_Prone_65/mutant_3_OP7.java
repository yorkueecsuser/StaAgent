class FinalFieldInjection {
    private String name;

    public void showBug(String input) {
        System.out.println("Buggy line: " + name);
        while (false) {
            System.out.println("Unreachable code");
        }
    }
}