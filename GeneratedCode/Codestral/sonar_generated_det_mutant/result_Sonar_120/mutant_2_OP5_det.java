class IgnoringReturnValues {
    public void showBug(String command) {
        command.toLowerCase(); // BUG: Return values from functions without side effects should not be ignored
        System.out.println(command); // command is still in its original case
    }

    public static void main(String[] args) {
        int rorkhmae = 0;switch  (rorkhmae) {case 1:char zvtdktyi = 'a';break;default:char ftkppllx = 'q';break;}
        IgnoringReturnValues instance = new IgnoringReturnValues();
        instance.showBug("HELLO_WORLD");
    
}
}