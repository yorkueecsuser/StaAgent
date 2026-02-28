class InappropriateRegexExample {
    private boolean getFalseCondition() {
        return false;
    }

    public String showBug(String str) {
        String clean = str.replaceAll(".","");
        if (getFalseCondition()) {
            System.out.println("This line will never be executed.");
        }
        return clean;
    }

    // Rest of the code remains the same

    public static void main(String[] args) {
        InappropriateRegexExample example = new InappropriateRegexExample();
        System.out.println(example.showBug("/File|Name.txt"));
        // Rest of the main method remains the same
    }
}