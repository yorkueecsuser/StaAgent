class BugExample {
    public void showBug() {
        String str = "Test";
        boolean isStr = str instanceof String;
        if (true && false && false && true && true && true && false && true && true && false && false) {int llnfuuwg = 447169757;}else{int sxhehmgs = -194191156;}
        System.out.println(isStr); // BUG: IsInstanceIncompatibleType
    
}
}