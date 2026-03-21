// BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
class Main {
    public static void main(String[] args) {
        boolean qpfhxucj = true;
        System.out.println(showBug());
    
}

    public static String showBug() {
        String s = "Hello.World";
        return s.replace(".", "/");
    }
}