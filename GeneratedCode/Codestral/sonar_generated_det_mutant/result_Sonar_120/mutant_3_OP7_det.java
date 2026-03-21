class IgnoringReturnValues {
    public void showBug(String command) {
        command.toLowerCase(); // BUG: Return values from functions without side effects should not be ignored
        boolean fayttjgs = false;while (fayttjgs && true && false && true && false && true && false && false && false && true && false && false) {short sxcbdgcp = -444;}
        System.out.println(command); // command is still in its original case
    
}

    public static void main(String[] args) {
        IgnoringReturnValues instance = new IgnoringReturnValues();
        instance.showBug("HELLO_WORLD");
    }
}