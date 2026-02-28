class StringBuilderBugExample {

    public String showBug() {
        // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        StringBuilder sb = new StringBuilder('A');
        StringBuffer sf = new StringBuffer('A');
        
        // Mutated variable names
        StringBuilder x = new StringBuilder('A');
        StringBuffer y = new StringBuffer('A');
        
        // Demonstrating the bug by appending to the StringBuilder and StringBuffer
        sb.append(" Test");
        sf.append(" Test");
        
        // Demonstrating the bug by appending to the mutated StringBuilder and StringBuffer
        x.append(" Test");
        y.append(" Test");
        
        return "StringBuilder capacity: " + sb.capacity() + ", StringBuffer capacity: " + sf.capacity() +
               ", Mutated StringBuilder capacity: " + x.capacity() + ", Mutated StringBuffer capacity: " + y.capacity();
    }

    public static void main(String[] args) {
        StringBuilderBugExample example = new StringBuilderBugExample();
        System.out.println(example.showBug());
    }
}