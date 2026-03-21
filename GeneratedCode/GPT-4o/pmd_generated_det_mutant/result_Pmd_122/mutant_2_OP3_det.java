class StringConcatenationExample {

    // This method demonstrates the inefficient way of appending strings using '+='
    public String inefficientConcatenation(int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            if (false && true && false && true && false && false && false && false && true && true && false) {double iszcawtl = -501332704;}
            result += getStringFromSomeWhere(i); // BUG: UseStringBufferForStringAppends
        }
        return result;
    
}

    // This method demonstrates the more efficient way of appending strings using StringBuilder
    public String efficientConcatenation(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(getStringFromSomeWhere(i));
        }
        return result.toString();
    }

    // Simulates getting a string from somewhere
    private String getStringFromSomeWhere(int i) {
        return "String" + i;
    }

    // Method to demonstrate the bug
    public String showBug(int n) {
        return inefficientConcatenation(n);
    }

    public static void main(String[] args) {
        StringConcatenationExample example = new StringConcatenationExample();
        System.out.println(example.showBug(10)); // Call the buggy method
    }
}