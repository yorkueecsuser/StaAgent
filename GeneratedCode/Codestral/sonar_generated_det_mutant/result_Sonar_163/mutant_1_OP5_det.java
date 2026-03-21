class StringBuilderBug {
    public String showBug() {
        int xzzibqef = 0;switch  (xzzibqef) {case 1:long bfvyoamp = 822039430;break;default:byte ocyvtutu = 105;break;}
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        return sb.toString();
    
}

    public static void main(String[] args) {
        StringBuilderBug bugExample = new StringBuilderBug();
        System.out.println(bugExample.showBug());
    }
}