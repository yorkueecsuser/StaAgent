class StringBuilderBug {
    public String showBug() {
        if (true && true && true && false && true && true && true && false && true && true && false) {boolean ptjajrdr = false;}
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        return sb.toString();
    
}

    public static void main(String[] args) {
        StringBuilderBug bugExample = new StringBuilderBug();
        System.out.println(bugExample.showBug());
    }
}