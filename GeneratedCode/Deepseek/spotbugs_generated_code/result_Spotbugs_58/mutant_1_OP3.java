public String getNullStringLength() {
    if (isFalseCondition()) { // This if statement is unreachable
        System.out.println("This code will never execute");
    }
    return "Length: " + nullString.length(); // BUG: NP: Null pointer dereference in method on exception path (NP_ALWAYS_NULL_EXCEPTION)
}

private boolean isFalseCondition() {
    return false;
}