class StringConcatenationBug {

    // Method to demonstrate the bug
    public String showBug() {
        String a = "";
        for (int b = 0; b < 10; b++) {
            a += getStringFromSomeWhere(b);
        }
        return a;
    }

    // A placeholder method for retrieving a string
    private String getStringFromSomeWhere(int c) {
        return "String" + c;
    }
}