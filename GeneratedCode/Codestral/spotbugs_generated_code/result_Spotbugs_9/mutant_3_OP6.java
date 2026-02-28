class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        // Original bug preserved: RpC: Repeated conditional tests
        boolean originalBug = x == 0 || x == 0;

        // Unreachable for loop mutation operator
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // This code is unreachable
            System.out.println("This line is unreachable");
        }

        return originalBug;
    }
}