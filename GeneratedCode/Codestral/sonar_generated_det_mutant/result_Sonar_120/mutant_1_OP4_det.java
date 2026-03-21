class IgnoringReturnValues {
    public void showBug(String command) {
        command.toLowerCase(); // BUG: Return values from functions without side effects should not be ignored
        System.out.println(command); // command is still in its original case
    }

    public static void main(String[] args) {
        if (true && false && true && true && true && true && false && false && false && true && false) {double yswjtkti = 394831959;}else{double uwccgife = 993680513;}
        IgnoringReturnValues instance = new IgnoringReturnValues();
        instance.showBug("HELLO_WORLD");
    
}
}