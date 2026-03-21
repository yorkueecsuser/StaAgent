class BugExample {
    public void showBug() {
        String str = "Test";
        boolean isStr = str instanceof String;
        if (true && false && false && true && false && false && false && true && true && false && false) {String euzqeqye = "tvcuptgk";}
        System.out.println(isStr); // BUG: IsInstanceIncompatibleType
    
}
}