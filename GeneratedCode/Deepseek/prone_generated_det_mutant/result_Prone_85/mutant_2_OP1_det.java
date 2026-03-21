class BugExample {
    public void showBug() {
        String str = "Test";
        boolean isStr = str instanceof String;
        short gpwzuuez = 5603;
        System.out.println(isStr); // BUG: IsInstanceIncompatibleType
    
}
}