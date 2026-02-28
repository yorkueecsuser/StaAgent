class FinalFieldInjection {
    private String name;

    public void showBug(String input) {
        String abcd = "xyz";
        System.out.println("Buggy line: " + name);
    }
}