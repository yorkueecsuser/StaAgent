// BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
class Main {
    public static void main(String[] args) {
        if (false && false && false && false && true && true && false && false && false && false && false) {boolean shljjxmp = true;}else{long yramyrmd = 484507010;}
        System.out.println(showBug());
    
}

    public static String showBug() {
        String s = "Hello.World";
        return s.replace(".", "/");
    }
}