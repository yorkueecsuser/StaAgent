class UnnecessaryCaseChangeBug {
    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(String buz) {
        boolean answer1 = buz.toUpperCase().equals("BAZ");

        // Added unreachable switch statement based on the 'Unreachable switch statement' mutation operator
        switch (getFalseCondition()? 1 : 0) {
            case 1:
                System.out.println("This is unreachable code!");
                break;
        }

        return answer1;
    }

    public boolean showAnotherBug(String buz) {
        boolean answer2 = buz.toUpperCase().equalsIgnoreCase("BAZ");

        // Added unreachable switch statement based on the 'Unreachable switch statement' mutation operator
        switch (getFalseCondition()? 1 : 0) {
            case 1:
                System.out.println("This is unreachable code!");
                break;
        }

        return answer2;
    }
}