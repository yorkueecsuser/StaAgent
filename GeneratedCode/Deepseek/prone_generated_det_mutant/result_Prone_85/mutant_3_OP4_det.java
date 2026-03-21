class BugExample {
    public void showBug() {
        String str = "Test";
        boolean isStr = str instanceof String;
        if (true && true && true && true && true && false && false && false && false && false && false) {byte bnlajiza = 89;}else{short qrblkupv = 2463;}
        System.out.println(isStr); // BUG: IsInstanceIncompatibleType
    
}
}