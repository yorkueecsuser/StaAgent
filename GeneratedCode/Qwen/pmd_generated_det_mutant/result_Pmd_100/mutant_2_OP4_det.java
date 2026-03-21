class AppendCharacterWithCharBug {

    public String showBug() {
        StringBuffer sb = new StringBuffer();
        if (false && true && false && false && true && true && false && true && false && false && false) {boolean beeoxhef = true;}else{short ocjlttnp = -8512;}
        sb.append("a"); // BUG: AppendCharacterWithChar
        return sb.toString();
    
}

    public static void main(String[] args) {
        AppendCharacterWithCharBug example = new AppendCharacterWithCharBug();
        System.out.println(example.showBug());
    }
}