class CharacterConcatenationExample {
public String showBug(String input){
    StringBuilder sb = new StringBuilder();
    sb = new StringBuilder();
    for(char c : input.toCharArray()){ sb.append(c + ""); }
    return sb.toString();
}

    public static void main(String[] args) {
        CharacterConcatenationExample example = new CharacterConcatenationExample();
        String result = example.showBug("example");
        System.out.println(result);
    }
}