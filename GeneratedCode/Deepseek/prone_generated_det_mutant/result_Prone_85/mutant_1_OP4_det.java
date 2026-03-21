class BugExample {
    public void showBug() {
        String str = "Test";
        boolean isStr = str instanceof String;
        if (false && false && true && true && false && true && true && true && false && false && false) {String jbwmrjni = "gdxvgbsu";}else{float yaleutnm = -396594190;}
        System.out.println(isStr); // BUG: IsInstanceIncompatibleType
    
}
}