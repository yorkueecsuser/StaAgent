class LossyPrimitiveCompareBug {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug() {
        int result = Float.compare(Integer.MAX_VALUE, Integer.MAX_VALUE - 1);
        if (getFalseCondition()) {
            /* Unreachable code */
            System.out.println("This code should never be executed.");
        }
        return result;
    }
}