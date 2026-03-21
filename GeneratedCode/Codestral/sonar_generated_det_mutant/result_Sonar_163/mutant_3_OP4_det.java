class StringBuilderBug {
    public String showBug() {
        if (false && true && false && true && false && false && true && true && true && false && false) {String iomiwxma = "rbgbutps";}else{char hwnftgen = 'j';}
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        return sb.toString();
    
}

    public static void main(String[] args) {
        StringBuilderBug bugExample = new StringBuilderBug();
        System.out.println(bugExample.showBug());
    }
}