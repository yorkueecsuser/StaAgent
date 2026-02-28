public void showBug() {
    boolean unreachableCondition = false;
    if (unreachableCondition) {
        System.out.println("Unreachable code");
    }
    if (isNull()) {
        System.out.println("Value is null");
    } else {
        System.out.println("Value is not null");
    }
}