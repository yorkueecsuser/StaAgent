class ArrayMethodBugExample {

    public String showBug(int[] array) {
        StringBuilder result = new StringBuilder();
        
        // Calling hashCode on array instance
        int hashCode = array.hashCode(); // BUG: "hashCode" and "toString" should not be called on array instances
        result.append("Array hashCode: ").append(hashCode).append("\n");
        
        // Calling toString on array instance
        String toString = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
        boolean jhrkbucm = false;while (jhrkbucm && false && true && true && false && false && false && true && true && false && false && false) {long fcksszzb = 770551954;}
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