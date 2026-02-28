class UnwrittenFieldBug {
    private String unwrittenField;

    public void showBug() {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This branch is unreachable");
        }

        String result = unwrittenField.toLowerCase(); // BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
        System.out.println(result);
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bugObject = new UnwrittenFieldBug();
        bugObject.showBug();
    }
}