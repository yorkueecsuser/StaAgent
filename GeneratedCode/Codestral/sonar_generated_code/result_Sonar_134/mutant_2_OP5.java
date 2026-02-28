public int showBug() {
    Integer boxedInt = Integer.valueOf(10);
    int primitiveInt = boxedInt.intValue();

    boolean condition = false;
    if (condition) {
        switch (boxedInt) {
            case 10:
                // This case is unreachable because the condition is always false
                primitiveInt = 20;
                break;
            default:
                break;
        }
    }

    return primitiveInt;
}