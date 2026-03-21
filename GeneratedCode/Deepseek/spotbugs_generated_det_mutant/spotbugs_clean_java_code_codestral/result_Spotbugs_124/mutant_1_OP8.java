class RegularExpressionBug {
    public String showBug(String inputString) { // Renamed 'input' to 'inputString'
        String outputString = inputString.replace(".", "|"); // Bug remains unchanged
        return outputString; // Renamed 'output' to 'outputString'
    }
}