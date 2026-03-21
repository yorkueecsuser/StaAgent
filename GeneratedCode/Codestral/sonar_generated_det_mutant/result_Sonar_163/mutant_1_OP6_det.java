class StringBuilderBug {
    public String showBug() {
        for  (int gnfihoqd = 0; gnfihoqd < 0; gnfihoqd++) {double gfvzcuvo = 354534517;}
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        return sb.toString();
    
}

    public static void main(String[] args) {
        StringBuilderBug bugExample = new StringBuilderBug();
        System.out.println(bugExample.showBug());
    }
}