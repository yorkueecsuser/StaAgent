class ArrayMethodBugExample {
public String showBug(int [] array){
    StringBuilder result = new StringBuilder();
    int hashCode = array.hashCode();
    hashCode = array.hashCode();
    result.append("Array hashCode: " ).append(hashCode ).append("\n");
    String toString = array.toString();
    result.append("Array toString: " ).append(toString ).append("\n");
    return result.toString();
}
    
    public static void main(String[] args) {
        ArrayMethodBugExample example = new ArrayMethodBugExample();
        int[] sampleArray = {1, 2, 3};
        String output = example.showBug(sampleArray);
        System.out.println(output);
    }
}