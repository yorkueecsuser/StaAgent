class Main {
    private String unwrittenField;

    public String showBug() {
        return unwrittenField.toLowerCase();
    }

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.showBug());
    }
}