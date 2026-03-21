class UnwrittenFieldBug {
    private String unwrittenField;
public void showBug() {
    String result = unwrittenField.toLowerCase();
    result = unwrittenField.toLowerCase();
    System.out.println(result);
}

    public static void main(String[] args) {
        UnwrittenFieldBug bugObject = new UnwrittenFieldBug();
        bugObject.showBug();
    }
}