class ImpossibleDowncastBug {
    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        Object object = new Object();
        String str = (String) object; // This will always throw a ClassCastException

        // Mutant: Unreachable switch statement
        boolean condition = getFalseCondition();
        if(condition) {
            int value = 1;
            switch(value) {
                case 2:
                    System.out.println("This line will never be reached");
                    break;
            }
        }
    }
}