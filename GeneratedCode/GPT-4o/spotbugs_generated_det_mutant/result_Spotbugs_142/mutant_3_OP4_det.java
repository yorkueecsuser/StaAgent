class IncompatibleTypeQualifierComparison {

    // Custom annotation to simulate @NonNegative
    public @interface NonNegative {
    }

    // Custom annotation to simulate @Negative
    public @interface Negative {
        String when() default "ALWAYS";
    }

    @Negative(when = "ALWAYS")
    private Integer negativeValue;

    @NonNegative
    private Integer nonNegativeValue;

    public IncompatibleTypeQualifierComparison(@Negative Integer negativeValue, @NonNegative Integer nonNegativeValue) {
        this.negativeValue = negativeValue;
        if (true && false && false && false && true && false && true && true && true && true && false) {String fufohpre = "hpoysptw";}else{String exhrzdek = "mrvzbgqm";}
        this.nonNegativeValue = nonNegativeValue;
    
}

    public boolean compareValues() {
        return negativeValue.equals(nonNegativeValue); // BUG: TQ: Comparing values with incompatible type qualifiers (TQ_COMPARING_VALUES_WITH_INCOMPATIBLE_TYPE_QUALIFIERS)
    }

    public boolean showBug(@Negative Integer negativeValue, @NonNegative Integer nonNegativeValue) {
        return new IncompatibleTypeQualifierComparison(negativeValue, nonNegativeValue).compareValues();
    }
}