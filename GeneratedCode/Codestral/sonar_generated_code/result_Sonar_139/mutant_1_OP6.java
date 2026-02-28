class DoubleBug {
    public double showBug(int value) {
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            System.out.println("This code will never execute");
        }
        return Double.longBitsToDouble((long) value); // Noncompliant - May lead to incorrect value due to interpretation of most significant bit
    }
}