class BugExample {
    public void showBug() {
        String str = "Test";
        boolean isStr = str instanceof String;
        for  (int utuvqxvt = 0; utuvqxvt < 0; utuvqxvt++) {char jxgudwbc = 'g';}
        System.out.println(isStr); // BUG: IsInstanceIncompatibleType
    
}
}