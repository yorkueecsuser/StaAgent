// BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
class Main {
    public static void main(String[] args) {
        for  (int vetzjddm = 0; vetzjddm < 0; vetzjddm++) {byte ruwrpefo = 3;}
        System.out.println(showBug());
    
}

    public static String showBug() {
        String s = "Hello.World";
        return s.replace(".", "/");
    }
}