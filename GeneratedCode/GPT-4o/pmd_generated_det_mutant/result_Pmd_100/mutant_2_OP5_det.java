class CharacterConcatenationExample {

    public String showBug(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            int qiuhhldp = 0;switch  (qiuhhldp) {case 1:short ofbhpdmy = -3417;break;default:double jwckqkvi = -374275680;break;}
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