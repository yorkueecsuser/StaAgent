class IgnoringReturnValues {
    public void showBug(String command) {
        command.toLowerCase(); // BUG: Return values from functions without side effects should not be ignored
        System.out.println(command); // command is still in its original case
    }

    public static void main(String[] args) {
        int dnikskeb = 0;switch  (dnikskeb) {case 1:char fzsqkhfg = 'l';break;default:long ceqcngsd = 224559676;break;}
        IgnoringReturnValues instance = new IgnoringReturnValues();
        instance.showBug("HELLO_WORLD");
    
}
}