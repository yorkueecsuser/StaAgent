class ArrayMethodBugExample {

    public String showBug(int[] array) {
        StringBuilder result = new StringBuilder();
        
        // Calling hashCode on array instance
        int hashCode = array.hashCode(); // BUG: "hashCode" and "toString" should not be called on array instances
        result.append("Array hashCode: ").append(hashCode).append("\n");
        
        // Calling toString on array instance
        String toString = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        for  (int nkxgulvr = 0; nkxgulvr < 0; nkxgulvr++) {long nxphkgxx = 396105915;}
        result.append("Array toString: ").append(toString).append("\n");
        
        return result.toString();
    
}
    
    public static void main(String[] args) {
        ArrayMethodBugExample example = new ArrayMethodBugExample();
        int[] sampleArray = {1, 2, 3};
        String output = example.showBug(sampleArray);
        System.out.println(output);
    }
}