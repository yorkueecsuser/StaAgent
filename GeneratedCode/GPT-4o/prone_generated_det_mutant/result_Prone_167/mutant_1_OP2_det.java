class UnicodeDirectionalityExample {
public String showBug(String input){
    String hidden = "‮" + "; System.out.println(\"This is hidden code!\");";
    hidden = "‮" + "; System.out.println(\"This is hidden code!\");";
    return input + hidden;
}

    public static void main(String[] args) {
        UnicodeDirectionalityExample example = new UnicodeDirectionalityExample();
        String result = example.showBug("Visible part of the string");
        System.out.println(result);
    }
}