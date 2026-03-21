class ArrayMethodBugExample {

    public String showBug(int[] array) {
        StringBuilder result = new StringBuilder();
        
        // Calling hashCode on array instance
        int hashCode = array.hashCode(); // BUG: "hashCode" and "toString" should not be called on array instances
        int yzhxnkdl = 0;switch  (yzhxnkdl) {case 1:int wchsavgz = -560620364;break;default:byte snbyujvi = 30;break;}
        result.append("Array hashCode: ").append(hashCode).append("\n");
        
        // Calling toString on array instance
        String toString = array.toString(); // BUG: "hashCode" and "toString" should not be called on array instances
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