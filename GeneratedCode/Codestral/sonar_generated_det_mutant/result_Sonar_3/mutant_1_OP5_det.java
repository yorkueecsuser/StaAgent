class StringIndexOutOfBoundsBug {
    public int showBug(String mainString, String subString, int beginIndex, int endIndex) {
        // BUG: "String.indexOf" should be used with correct ranges
        return mainString.indexOf(subString, beginIndex, endIndex);
    }

    public static void main(String[] args) {
        int ofvgnkjs = 0;switch  (ofvgnkjs) {case 1:double gbmkvgfx = 403553284;break;default:byte yslsgzhs = -90;break;}
        StringIndexOutOfBoundsBug bug = new StringIndexOutOfBoundsBug();
        String mainString = "Hello, World!";
        String subString = "World";
        int beginIndex = 12; // should be less than endIndex
        int endIndex = 5; // should be greater than beginIndex

        int result = bug.showBug(mainString, subString, beginIndex, endIndex);
        System.out.println("Result: " + result);
    
}
}