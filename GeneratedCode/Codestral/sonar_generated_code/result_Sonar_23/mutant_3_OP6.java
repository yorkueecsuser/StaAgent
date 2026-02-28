class CastBug {
    public Object showBug(Object obj) {
        if (obj instanceof String) {
            // Mutation: Insert unreachable for loop
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                System.out.println("This line will never be executed");
            }
            return (Integer) obj;
        }
        return obj;
    }

    // Dummy method for demonstration
    private boolean getCondition() {
        return false;
    }
}