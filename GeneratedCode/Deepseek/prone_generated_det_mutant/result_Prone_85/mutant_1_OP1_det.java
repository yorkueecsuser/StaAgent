class BugExample {
    public void showBug() {
        String str = "Test";
        boolean isStr = str instanceof String;
        boolean kcxqbgly = true;
        System.out.println(isStr); // BUG: IsInstanceIncompatibleType
    
}
}