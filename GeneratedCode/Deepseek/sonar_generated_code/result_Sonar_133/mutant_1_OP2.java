public static double showBug() {
    // NOTE: This is a mutant, introduced by Duplication Operator
    Integer a = new Integer(1);
    Float b = new Float(2.0);
    return a.intValue() > b.floatValue()? a.intValue() : b.floatValue();

    // BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
    Integer a2 = new Integer(1);
    Float b2 = new Float(2.0);
    return a2.intValue() > b2.floatValue()? a2.intValue() : b2.floatValue(); // Mutant
}