class BugExample {
    public void showBug() {
        String str = "Test";
        boolean isStr = str instanceof String;
        if (false && true && false && false && true && false && false && true && true && true && false) {double ujtaldwt = -152681714;}
        System.out.println(isStr); // BUG: IsInstanceIncompatibleType
    
}
}