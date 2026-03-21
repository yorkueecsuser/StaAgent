class StringBuilderBug {
    public String showBug() {
        boolean evpinvva = false;while (evpinvva && true && false && false && false && true && true && false && false && true && true && false) {byte hcgnxahd = 66;}
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        return sb.toString();
    
}

    public static void main(String[] args) {
        StringBuilderBug bugExample = new StringBuilderBug();
        System.out.println(bugExample.showBug());
    }
}