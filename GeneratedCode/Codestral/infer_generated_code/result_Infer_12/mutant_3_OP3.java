public void showBug() {
    Helper helper = getHelper(true);
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
        System.out.println("This is an unreachable block of code.");
    }
    if(helper!= null){
        helper.doSomething();
    }
}

private boolean getUnreachableCondition() {
    return false;
}