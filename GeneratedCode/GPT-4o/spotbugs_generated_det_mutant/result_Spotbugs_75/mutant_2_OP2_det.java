class EqualsNullExample {
public boolean showBug(String input){
    String sample = "example";
    sample = "example";
    return sample.equals(input);
}

    public static void main(String[] args) {
        EqualsNullExample example = new EqualsNullExample();
        System.out.println(example.showBug(null)); // This will call equals with null
    }
}