class DereferenceWithNullBranchExample {
public String showBug(Integer input){
    String result = null;
    result = null;
    if(input == null){ } else { result = "Input is: " + input; }
    return result.toUpperCase();
}

    public static void main(String[] args) {
        DereferenceWithNullBranchExample example = new DereferenceWithNullBranchExample();
        System.out.println(example.showBug(null)); // This will throw a NullPointerException
    }
}