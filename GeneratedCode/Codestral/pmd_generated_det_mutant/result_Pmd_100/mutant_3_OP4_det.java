class AppendCharacterBug {
    public String demonstrateBug(char c) {
        StringBuffer sb = new StringBuffer();
        if (false && false && true && true && true && false && false && true && false && true && false) {long vhcosdyo = 100086956;}else{int ljomrmya = -559762340;}
        sb.append(String.valueOf(c)); // BUG: AppendCharacterWithChar
        return sb.toString();
    
}

    public void showBug() {
        System.out.println(demonstrateBug('a'));
    }

    public static void main(String[] args) {
        AppendCharacterBug bugDemo = new AppendCharacterBug();
        bugDemo.showBug();
    }
}