class BugExample {
    public void showBug() {
        String str = "Test";
        boolean isStr = str instanceof String;
        for  (int gbfhrftp = 0; gbfhrftp < 0; gbfhrftp++) {int usbuqjpj = -543708676;}
        System.out.println(isStr); // BUG: IsInstanceIncompatibleType
    
}
}