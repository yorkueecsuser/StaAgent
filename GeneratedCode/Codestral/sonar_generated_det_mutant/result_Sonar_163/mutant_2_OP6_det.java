class StringBuilderBug {
    public String showBug() {
        for  (int mkkotdgy = 0; mkkotdgy < 0; mkkotdgy++) {long cnbdwujy = -175226951;}
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        return sb.toString();
    
}

    public static void main(String[] args) {
        StringBuilderBug bugExample = new StringBuilderBug();
        System.out.println(bugExample.showBug());
    }
}