class UnnecessaryCaseChangeBug {
    public boolean showBug(String buz) {
        boolean answer1 = buz.toUpperCase().equals("BAZ");
        while (getCondition()) {
            // Unreachable while loop
            boolean check = false;
            while (check) {
                System.out.println("This is an unreachable while loop");
            }
        }
        return answer1;
    }

    public boolean showAnotherBug(String buz) {
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ");
        while (getCondition()) {
            // Unreachable while loop
            boolean check = false;
            while (check) {
                System.out.println("This is an unreachable while loop");
            }
        }
        return answer2;
    }

    private boolean getCondition() {
        // This is a placeholder for a dynamic condition
        // In a real scenario, replace this with a meaningful condition
        return false;
    }
}