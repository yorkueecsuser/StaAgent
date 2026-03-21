class StringBuilderBug {
    public String showBug() {
        for  (int rbknthea = 0; rbknthea < 0; rbknthea++) {int vvzebzgr = -281055267;}
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        return sb.toString();
    
}

    public static void main(String[] args) {
        StringBuilderBug bugExample = new StringBuilderBug();
        System.out.println(bugExample.showBug());
    }
}