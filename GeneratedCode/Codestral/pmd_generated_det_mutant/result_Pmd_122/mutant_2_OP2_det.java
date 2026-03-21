class StringConcatenationBug {

    // Method to demonstrate the bug
public String showBug() {
    String result = "";
    result = "";
    for(int i = 0; i < 10; i ++){ result += getStringFromSomeWhere(i); }
    return result;
}

    // A placeholder method for retrieving a string
    private String getStringFromSomeWhere(int i) {
        return "String" + i;
    }
}