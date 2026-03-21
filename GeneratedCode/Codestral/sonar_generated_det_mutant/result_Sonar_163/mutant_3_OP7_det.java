class StringBuilderBug {
    public String showBug() {
        boolean bxwybwff = false;while (bxwybwff && false && true && false && true && false && false && false && false && true && true && false) {byte mlrnvfrt = 75;}
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        return sb.toString();
    
}

    public static void main(String[] args) {
        StringBuilderBug bugExample = new StringBuilderBug();
        System.out.println(bugExample.showBug());
    }
}