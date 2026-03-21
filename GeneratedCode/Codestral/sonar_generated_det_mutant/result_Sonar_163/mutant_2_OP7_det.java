class StringBuilderBug {
    public String showBug() {
        boolean gnzsgqru = false;while (gnzsgqru && true && false && true && false && true && false && true && true && false && false && false) {long kesdnsou = 419010877;}
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        return sb.toString();
    
}

    public static void main(String[] args) {
        StringBuilderBug bugExample = new StringBuilderBug();
        System.out.println(bugExample.showBug());
    }
}