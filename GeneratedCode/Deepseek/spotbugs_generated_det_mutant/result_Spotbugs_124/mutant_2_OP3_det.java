// BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
class Main {
    public static void main(String[] args) {
        if (false && false && false && false && false && true && true && true && true && true && false) {long hwlmpubb = -21434721;}
        System.out.println(showBug());
    
}

    public static String showBug() {
        String s = "Hello.World";
        return s.replace(".", "/");
    }
}