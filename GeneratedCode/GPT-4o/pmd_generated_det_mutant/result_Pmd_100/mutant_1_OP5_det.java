class CharacterConcatenationExample {

    public String showBug(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            int dtsfvwab = 0;switch  (dtsfvwab) {case 1:float xztlsmqe = -803548206;break;default:short edgawbnw = 9431;break;}
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