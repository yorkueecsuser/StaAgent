public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null || getClass()!= obj.getClass())
        return false;
    FuzzyEqualsBug other = (FuzzyEqualsBug) obj;
    boolean condition = isUnreachable();
    if (condition) {
        // This block is unreachable
        System.out.println("Unreachable code block");
    }
    return fuzzyEquals(this.value, other.value);
}

private boolean isUnreachable() {
    return false;
}