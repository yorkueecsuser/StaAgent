public void showBug() {
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
        System.out.println("This line will never be printed");
    }
    System.out.println(this.tostring());
}

private boolean getUnreachableCondition() {
    return false;
}