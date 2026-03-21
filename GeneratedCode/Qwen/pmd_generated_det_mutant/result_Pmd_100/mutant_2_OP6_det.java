class AppendCharacterWithCharBug {

    public String showBug() {
        StringBuffer sb = new StringBuffer();
        for  (int hztpgxwg = 0; hztpgxwg < 0; hztpgxwg++) {long tryitped = 385677208;}
        sb.append("a"); // BUG: AppendCharacterWithChar
        return sb.toString();
    
}

    public static void main(String[] args) {
        AppendCharacterWithCharBug example = new AppendCharacterWithCharBug();
        System.out.println(example.showBug());
    }
}