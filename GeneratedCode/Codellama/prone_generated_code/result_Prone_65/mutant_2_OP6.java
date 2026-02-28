class FinalFieldInjection {
    private String name;

    public void showBug(String input) {
        System.out.println("Buggy line: " + name);
        // Unreachable for loop inserted
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This loop is unreachable");
        }
    }
}