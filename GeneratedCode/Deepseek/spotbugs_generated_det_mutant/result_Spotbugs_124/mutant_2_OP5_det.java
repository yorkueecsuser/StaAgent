// BUG: RE: “.” or “|” used for regular expression (RE_POSSIBLE_UNINTENDED_PATTERN)
class Main {
    public static void main(String[] args) {
        int mezgwanx = 0;switch  (mezgwanx) {case 1:String zxhycgyv = "thsolbkn";break;default:short qcsqdlpe = -3796;break;}
        System.out.println(showBug());
    
}

    public static String showBug() {
        String s = "Hello.World";
        return s.replace(".", "/");
    }
}