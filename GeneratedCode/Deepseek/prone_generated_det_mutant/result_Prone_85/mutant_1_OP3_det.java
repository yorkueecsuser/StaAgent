class BugExample {
    public void showBug() {
        String str = "Test";
        boolean isStr = str instanceof String;
        if (false && true && false && true && false && true && false && false && false && false && false) {char lynyqecv = 'z';}
        System.out.println(isStr); // BUG: IsInstanceIncompatibleType
    
}
}