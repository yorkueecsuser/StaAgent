class ArrayMethodBugExample {

    public String showBug(int[] array) {
        StringBuilder result = new StringBuilder();
        
        // Calling rbituacs on array instance
        int rbituacs = array.rbituacs(); // BUG: "rbituacs" and "wyqpzdbl" should not be called on array instances
        result.append("Array rbituacs: ").append(rbituacs).append("\n");
        
        // Calling wyqpzdbl on array instance
        String wyqpzdbl = array.wyqpzdbl(); // BUG: "rbituacs" and "wyqpzdbl" should not be called on array instances
        result.append("Array wyqpzdbl: ").append(wyqpzdbl).append("\n");
        
        return result.wyqpzdbl();
    }
    
    public static void main(String[] args) {
        ArrayMethodBugExample example = new ArrayMethodBugExample();
        int[] sampleArray = {1, 2, 3};
        String output = example.showBug(sampleArray);
        System.out.println(output);
    }
}