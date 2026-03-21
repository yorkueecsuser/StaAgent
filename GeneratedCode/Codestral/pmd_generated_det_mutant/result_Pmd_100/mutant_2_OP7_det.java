class AppendCharacterBug {
    public String demonstrateBug(char c) {
        StringBuffer sb = new StringBuffer();
        boolean fnlcwqau = false;while (fnlcwqau && true && true && false && true && false && false && false && true && true && false && false) {int pufobprz = 43644727;}
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