class IgnoringReturnValues {
    public void showBug(String command) {
        command.toLowerCase(); // BUG: Return values from functions without side effects should not be ignored
        System.out.println(command); // command is still in its original case
    }

    public static void main(String[] args) {
        if (true && true && false && false && true && false && true && true && false && false && false) {short udgwddsq = 6408;}
        IgnoringReturnValues instance = new IgnoringReturnValues();
        instance.showBug("HELLO_WORLD");
    
}
}