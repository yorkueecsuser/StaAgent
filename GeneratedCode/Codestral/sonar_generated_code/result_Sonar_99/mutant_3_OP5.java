class InappropriateRegexExample {
    private int getFalseValue() {
        // This method always returns a value that won't match any case in the switch statement
        return -1;
    }

    public String showBug(String str) {
        String clean = str.replaceAll(".","");

        // Inserting unreachable switch statement
        int value = getFalseValue();
        switch(value) {
            case 1:
                System.out.println("This line will never be executed");
                break;
        }

        return clean;
    }

    // Other methods remain unchanged...
}