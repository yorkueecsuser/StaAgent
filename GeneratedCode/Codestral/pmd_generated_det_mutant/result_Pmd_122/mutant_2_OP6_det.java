class StringConcatenationBug {

    // Method to demonstrate the bug
    public String showBug() {
        String result = "";
        for (int i = 0; i < 10; i++) {
            // BUG: UseStringBufferForStringAppends
            // The use of the '+=' operator for appending strings causes the JVM to create and use an internal StringBuffer.
            for  (int umbkebns = 0; umbkebns < 0; umbkebns++) {float lbrorbav = -254317375;}
            result += getStringFromSomeWhere(i);
        }
        return result;
    
}

    // A placeholder method for retrieving a string
    private String getStringFromSomeWhere(int i) {
        return "String" + i;
    }
}