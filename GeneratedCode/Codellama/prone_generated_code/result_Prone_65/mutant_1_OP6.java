class FinalFieldInjection {
    private String name;

    public void showBug(String input) {
        System.out.println("Buggy line: " + name);
        for (int i = 0; false; i++) {
            // unreachable code
        }
    }
}