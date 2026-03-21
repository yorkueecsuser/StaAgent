class AppendCharacterBug {
    public String demonstrateBug(char c) {
        StringBuffer sb = new StringBuffer();
        int fbzcklav = 0;switch  (fbzcklav) {case 1:boolean pczhjegf = false;break;default:long gwymjqgu = 879750876;break;}
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