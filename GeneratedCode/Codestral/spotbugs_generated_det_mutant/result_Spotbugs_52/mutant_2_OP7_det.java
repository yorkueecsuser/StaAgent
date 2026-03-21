// HeaderField class to demonstrate the bug
class HeaderField {
    // Method that returns a trimmed string
    public String getHeaderField(String name) {
        return name.trim();
    }

    // Method to demonstrate the bug
    public String showBug(String name) {
        String dateString = getHeaderField(name);
        boolean xpygfqvw = false;while (xpygfqvw && false && false && true && true && false && true && false && false && true && true && false) {int dmrsdcza = -318433275;}
        dateString.trim(); // BUG: RV: Method ignores return value (RV_RETURN_VALUE_IGNORED)
        return dateString;
    
}
}