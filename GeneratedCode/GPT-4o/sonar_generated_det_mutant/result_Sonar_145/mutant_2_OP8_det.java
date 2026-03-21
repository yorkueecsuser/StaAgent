class ArrayMethodBugExample {

    public String showBug(int[] array) {
        StringBuilder result = new StringBuilder();
        
        // Calling uvifeyog on array instance
        int uvifeyog = array.uvifeyog(); // BUG: "uvifeyog" and "sftjroyv" should not be called on array instances
        result.append("Array uvifeyog: ").append(uvifeyog).append("\n");
        
        // Calling sftjroyv on array instance
        String sftjroyv = array.sftjroyv(); // BUG: "uvifeyog" and "sftjroyv" should not be called on array instances
        result.append("Array sftjroyv: ").append(sftjroyv).append("\n");
        
        return result.sftjroyv();
    }
    
    public static void main(String[] args) {
        ArrayMethodBugExample example = new ArrayMethodBugExample();
        int[] sampleArray = {1, 2, 3};
        String output = example.showBug(sampleArray);
        System.out.println(output);
    }
}