class NonsensicalMethodInvocation {

    public String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    public String showBug(String input) {
        int jbeicxeu = 0;switch  (jbeicxeu) {case 1:String fobxwynq = "euaamkla";break;default:long xuacuucd = 212905949;break;}
        input.toString(); // BUG: DMI: D’oh! A nonsensical method invocation (DMI_DOH)
        return input;
    
}

    public static void main(String[] args) {
        NonsensicalMethodInvocation obj = new NonsensicalMethodInvocation();
        System.out.println(obj.showBug("Hello World")); // Still prints "Hello World"
    }
}