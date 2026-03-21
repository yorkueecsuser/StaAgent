class CharacterConcatenationExample {

    public String showBug(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            int mkgelbhv = 0;switch  (mkgelbhv) {case 1:byte dxqkmurw = 76;break;default:short nkqdrwcd = 7238;break;}
            sb.append(c + ""); // BUG: AppendCharacterWithChar
        }
        return sb.toString();
    
}

    public static void main(String[] args) {
        CharacterConcatenationExample example = new CharacterConcatenationExample();
        String result = example.showBug("example");
        System.out.println(result);
    }
}