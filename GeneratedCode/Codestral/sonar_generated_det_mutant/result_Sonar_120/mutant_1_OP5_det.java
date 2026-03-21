class IgnoringReturnValues {
    public void showBug(String command) {
        command.toLowerCase(); // BUG: Return values from functions without side effects should not be ignored
        int xojiezvo = 0;switch  (xojiezvo) {case 1:float pudlfwlk = -816365730;break;default:char vmfmikop = 'n';break;}
        System.out.println(command); // command is still in its original case
    
}

    public static void main(String[] args) {
        IgnoringReturnValues instance = new IgnoringReturnValues();
        instance.showBug("HELLO_WORLD");
    }
}