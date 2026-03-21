class AppendCharacterBug {
    public String demonstrateBug(char c) {
        StringBuffer sb = new StringBuffer();
        int pznscucz = 0;switch  (pznscucz) {case 1:boolean gfanufod = true;break;default:float aodoqleb = 109277367;break;}
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