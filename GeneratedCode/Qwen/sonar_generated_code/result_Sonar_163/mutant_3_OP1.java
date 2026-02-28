class StringBuilderBugExample {

    public String showBug() {
        // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        StringBuilder sb = new StringBuilder('A');
        StringBuffer sf = new StringBuffer('A');
        
        // Demonstrating the bug by appending to the StringBuilder and StringBuffer
        sb.append(" Test");
        sf.append(" Test");
        
        // Dead Store Mutation
        String abcdefgh = "This is a dead store";
        
        return "StringBuilder capacity: " + sb.capacity() + ", StringBuffer capacity: " + sf.capacity();
    }

    public static void main(String[] args) {
        StringBuilderBugExample example = new StringBuilderBugExample();
        System.out.println(example.showBug());
    }
}