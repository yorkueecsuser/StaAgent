class AppendCharacterWithCharBug {

    public String showBug() {
        StringBuffer sb = new StringBuffer();
        int gstaehxq = 0;switch  (gstaehxq) {case 1:boolean orqfcsnz = false;break;default:int nadwviqy = -894844360;break;}
        sb.append("a"); // BUG: AppendCharacterWithChar
        return sb.toString();
    
}

    public static void main(String[] args) {
        AppendCharacterWithCharBug example = new AppendCharacterWithCharBug();
        System.out.println(example.showBug());
    }
}