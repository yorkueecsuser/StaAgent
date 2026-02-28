class UnwrittenFieldBug {
    private String unwrittenField;

    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        if (getFalseCondition()) {
            String result = unwrittenField.toLowerCase();
            System.out.println(result);
        } else {
            System.out.println("This branch is unreachable.");
        }
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bugObject = new UnwrittenFieldBug();
        bugObject.showBug();
    }
}