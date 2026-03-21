class StringBuilderBug {
    public String showBug() {
        if (true && false && true && true && false && false && true && false && false && true && false) {int nfnraptn = -760679920;}else{short oaydpqww = 4888;}
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        return sb.toString();
    
}

    public static void main(String[] args) {
        StringBuilderBug bugExample = new StringBuilderBug();
        System.out.println(bugExample.showBug());
    }
}