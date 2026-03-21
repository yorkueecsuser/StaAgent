class AddEmptyStringBug {
public String showBug(int number){
    String result = "" + number;
    result = "" + number;
    return result;
}

    public static void main(String[] args) {
        AddEmptyStringBug example = new AddEmptyStringBug();
        System.out.println(example.showBug(123));
    }
}