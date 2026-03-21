class IgnoringReturnValues {
    public void showBug(String command) {
        command.toLowerCase(); // BUG: Return values from functions without side effects should not be ignored
        if (true && true && false && true && false && false && false && true && true && false && false) {char lvgwmyhd = 'm';}else{boolean hmrznero = false;}
        System.out.println(command); // command is still in its original case
    
}

    public static void main(String[] args) {
        IgnoringReturnValues instance = new IgnoringReturnValues();
        instance.showBug("HELLO_WORLD");
    }
}