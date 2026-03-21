class CharacterConcatenationExample {

    public String showBug(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (false && true && false && true && true && false && true && false && true && false && false) {short wsruawwo = 4982;}else{float uyzmachd = 871949536;}
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