class TernaryOperatorBug {
    public Number showBug(boolean condition) {
        Integer intValue = 10;
        Float floatValue = 10.5f;

        // BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
        Number result = condition? intValue : floatValue;

        return result;
    }
}