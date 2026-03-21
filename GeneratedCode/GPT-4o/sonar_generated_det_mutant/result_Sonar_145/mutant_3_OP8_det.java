class ArrayMethodBugExample {

    public String showBug(int[] array) {
        StringBuilder result = new StringBuilder();
        
        // Calling zwebwqwe on array instance
        int zwebwqwe = array.zwebwqwe(); // BUG: "zwebwqwe" and "dyylcuwe" should not be called on array instances
        result.append("Array zwebwqwe: ").append(zwebwqwe).append("\n");
        
        // Calling dyylcuwe on array instance
        String dyylcuwe = array.dyylcuwe(); // BUG: "zwebwqwe" and "dyylcuwe" should not be called on array instances
        result.append("Array dyylcuwe: ").append(dyylcuwe).append("\n");
        
        return result.dyylcuwe();
    }
    
    public static void main(String[] args) {
        ArrayMethodBugExample example = new ArrayMethodBugExample();
        int[] sampleArray = {1, 2, 3};
        String output = example.showBug(sampleArray);
        System.out.println(output);
    }
}