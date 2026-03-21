class BugExample {
    public void showBug() {
        String str = "Test";
        boolean isStr = str instanceof String;
        for  (int astipliu = 0; astipliu < 0; astipliu++) {double zcdoxchz = -543119586;}
        System.out.println(isStr); // BUG: IsInstanceIncompatibleType
    
}
}