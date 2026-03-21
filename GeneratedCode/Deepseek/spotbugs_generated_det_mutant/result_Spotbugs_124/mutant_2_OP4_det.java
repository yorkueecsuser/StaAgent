// BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
class Main {
    public static void main(String[] args) {
        if (true && true && true && false && false && false && false && true && true && true && false) {int vmmfbqzz = 342352865;}else{boolean ehpnddii = false;}
        System.out.println(showBug());
    
}

    public static String showBug() {
        String s = "Hello.World";
        return s.replace(".", "/");
    }
}