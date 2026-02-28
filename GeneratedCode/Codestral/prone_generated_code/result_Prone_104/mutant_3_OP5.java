class MathRoundIntLongBug {

    private boolean getFalseCondition() {
        return false;
    }

    public int showBug(long number) {
        if(getFalseCondition()) {
            // Inserting unreachable switch statement
            switch(number) {
                case 1:
                    System.out.println("This line should not be executed");
                    break;
                default:
                    break;
            }
        }
        // BUG: MathRoundIntLong - Math.round() is called with a long type, which can't be represented with float. This may result in truncation.
        return Math.round(number);
    }
}