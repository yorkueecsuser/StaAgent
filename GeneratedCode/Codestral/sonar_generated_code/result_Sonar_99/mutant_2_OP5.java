class InappropriateRegexExample {
    public String showBug(String str) {
        String clean = str.replaceAll(".","");

        int value = getValue();
        switch(value) {
            case -1:
                // This case is unreachable because getValue() never returns -1
                System.out.println("Unreachable code");
                break;
            default:
                break;
        }
        return clean;
    }

    // Placeholder method for demonstration. In a real-world scenario, this method should return a value other than -1.
    private int getValue() {
        return 0;
    }

    // Other methods and main method remain unchanged
}