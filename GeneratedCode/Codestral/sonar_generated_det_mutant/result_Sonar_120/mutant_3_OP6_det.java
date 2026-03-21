class IgnoringReturnValues {
    public void showBug(String command) {
        command.toLowerCase(); // BUG: Return values from functions without side effects should not be ignored
        for  (int udppotya = 0; udppotya < 0; udppotya++) {byte scrjmish = -76;}
        System.out.println(command); // command is still in its original case
    
}

    public static void main(String[] args) {
        IgnoringReturnValues instance = new IgnoringReturnValues();
        instance.showBug("HELLO_WORLD");
    }
}