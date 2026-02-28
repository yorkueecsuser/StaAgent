class UnnecessaryTypeCheck {
    public Object showBug(Object obj) {
        if (obj instanceof String) {
            // Unreachable switch statement mutation
            int value = getFalseValue(); // This method should always return a value that is not 1
            switch(value) {
                case 1:
                    System.out.println("This line should never be executed");
                    break;
            }

            return ((String) obj).toUpperCase();
        }
        throw new IllegalArgumentException("Object is not a String");
    }

    private int getFalseValue() {
        return 0; // Always returns a value that is not 1
    }
}