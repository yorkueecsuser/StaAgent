class FinalFieldInjection {
    private String name;

    public void showBug(String input) {
        String xvzlkjhd = "dead store"; // dead store mutant
        System.out.println("Buggy line: " + name);
    }
}