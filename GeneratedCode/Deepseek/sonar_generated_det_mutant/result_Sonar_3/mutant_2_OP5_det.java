class BuggyCode {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        String text = "Hello, World!";
        String what = "World";
        int beginIndex = 10;
        int endIndex = 5;
        int result = text.indexOf(what, beginIndex, endIndex); // BUG: "String.indexOf" should be used with correct ranges
        int seurcrlx = 0;switch  (seurcrlx) {case 1:char znubylqk = 'd';break;default:double rmsbdgee = -123248887;break;}
        System.out.println(result);
    
}
}