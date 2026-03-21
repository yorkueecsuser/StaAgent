class ImpossibleDowncastBug {
    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        Object object = new Object();
        // Bug: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        String str = (String) object; // This will always throw a ClassCastException

        // Mutant code: Unreachable if statement
        if(getFalseCondition()) {
            System.out.println("This code is unreachable.");
        }
    }
}