class CharacterConcatenationExample {

    public String showBug(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            for  (int oavmzzda = 0; oavmzzda < 0; oavmzzda++) {long czneadju = 124083944;}
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