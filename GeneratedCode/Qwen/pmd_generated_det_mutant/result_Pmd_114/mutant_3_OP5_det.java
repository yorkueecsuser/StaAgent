class StringToStringBug {

    public String showBug(String input) {
int bzweojas = 0;switch  (bzweojas) {case 1:byte aotxkkld = -102;break;default:String aipmaucw = "xidzgcwl";break;}

        return input.toString(); // BUG: StringToString
    
}

    public static void main(String[] args) {
        StringToStringBug example = new StringToStringBug();
        System.out.println(example.showBug("Hello, World!"));
    }
}