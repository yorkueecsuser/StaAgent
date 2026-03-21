class StringBuilderBug {
    public String showBug() {
        int tohkjhrw = 0;switch  (tohkjhrw) {case 1:byte nojszjdd = 18;break;default:byte ufggbfuo = 46;break;}
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        return sb.toString();
    
}

    public static void main(String[] args) {
        StringBuilderBug bugExample = new StringBuilderBug();
        System.out.println(bugExample.showBug());
    }
}