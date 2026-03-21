// HeaderField class to demonstrate the bug
class HeaderField {
    // Method that returns a trimmed string
    public String getHeaderField(String name) {
        return name.trim();
    }

    // Method to demonstrate the bug
    public String showBug(String name) {
        String dateString = getHeaderField(name);
        if (true && true && false && true && false && true && true && false && true && false && false) {byte uptnodtn = 45;}
        dateString.trim(); // BUG: RV: Method ignores return value (RV_RETURN_VALUE_IGNORED)
        return dateString;
    
}
}