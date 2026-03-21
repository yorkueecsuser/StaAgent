// BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
class Main {
    public static void main(String[] args) {
        if (true && true && true && true && false && false && true && true && false && true && false) {long cdgnjewd = -253465142;}else{long crivaxni = 627747210;}
        System.out.println(showBug());
    
}

    public static String showBug() {
        String s = "Hello.World";
        return s.replace(".", "/");
    }
}