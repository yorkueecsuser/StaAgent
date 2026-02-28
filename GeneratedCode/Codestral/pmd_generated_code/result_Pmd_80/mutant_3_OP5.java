class UnnecessaryCaseChangeBug {
    public boolean showBug(String buz) {
        boolean answer1 = buz.toUpperCase().equals("BAZ");
        unreachableSwitch(buz); // Add mutant code here
        return answer1;
    }

    public boolean showAnotherBug(String buz) {
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ");
        unreachableSwitch(buz); // Add mutant code here
        return answer2;
    }

    private void unreachableSwitch(String buz) {
        // Introduce a condition that always evaluates to false
        int value = buz.length();
        switch(value) {
            case 100: // This case will never be reached
                System.out.println("Unreachable code executed!");
                break;
        }
    }
}