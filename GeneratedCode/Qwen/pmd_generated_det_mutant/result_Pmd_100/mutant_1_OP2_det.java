class AppendCharacterWithCharBug {
public String showBug() {
    StringBuffer sb = new StringBuffer();
    sb = new StringBuffer();
    sb.append("a");
    return sb.toString();
}

    public static void main(String[] args) {
        AppendCharacterWithCharBug example = new AppendCharacterWithCharBug();
        System.out.println(example.showBug());
    }
}