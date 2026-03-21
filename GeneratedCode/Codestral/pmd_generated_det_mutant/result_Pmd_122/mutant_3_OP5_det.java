class StringConcatenationBug {

    // Method to demonstrate the bug
    public String showBug() {
        String result = "";
        for (int i = 0; i < 10; i++) {
            // BUG: UseStringBufferForStringAppends
            // The use of the '+=' operator for appending strings causes the JVM to create and use an internal StringBuffer.
            int owsxbizu = 0;switch  (owsxbizu) {case 1:String xhzryglx = "xhgkbijo";break;default:short pgudnaik = 1959;break;}
            result += getStringFromSomeWhere(i);
        }
        return result;
    
}

    // A placeholder method for retrieving a string
    private String getStringFromSomeWhere(int i) {
        return "String" + i;
    }
}