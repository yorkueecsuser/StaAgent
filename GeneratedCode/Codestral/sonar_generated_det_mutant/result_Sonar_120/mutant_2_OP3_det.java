class IgnoringReturnValues {
    public void showBug(String command) {
        command.toLowerCase(); // BUG: Return values from functions without side effects should not be ignored
        System.out.println(command); // command is still in its original case
    }

    public static void main(String[] args) {
        if (true && true && true && false && true && false && false && true && false && false && false) {int wsojnafl = 90375540;}
        IgnoringReturnValues instance = new IgnoringReturnValues();
        instance.showBug("HELLO_WORLD");
    
}
}