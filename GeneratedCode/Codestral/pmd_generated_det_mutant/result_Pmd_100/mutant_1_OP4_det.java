class AppendCharacterBug {
    public String demonstrateBug(char c) {
        StringBuffer sb = new StringBuffer();
        if (true && true && false && false && true && true && true && false && true && false && false) {String skbkqnnf = "oizwjjlo";}else{String suqzsgfp = "zltbplxt";}
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