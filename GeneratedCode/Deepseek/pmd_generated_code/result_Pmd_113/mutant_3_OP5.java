class StringInstantiation {
    private String bar = new String("bar"); // BUG: StringInstantiation

    public void showBug() {
        System.out.println(bar);
    }

    {
        int value = getValue(); 
        boolean shouldRun = getCondition();

        switch(value) {
            case 1: 
                if (shouldRun) {
                    // Code added for mutant (unreachable switch statement mutation)
                }
                break;
        }
    }
}