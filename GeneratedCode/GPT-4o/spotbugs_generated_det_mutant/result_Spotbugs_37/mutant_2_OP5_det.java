class HashCodeExample {

    private String value;

    public HashCodeExample(String value) {
        this.value = value;
    }
    
    // Incorrectly named method that looks similar to hashCode
    public int hashcode() {  int thorkfhd = 0;switch  (thorkfhd) {case 1:byte athfbdzx = 77;break;default:char lzutjfqi = 'u';break;}
  // BUG: Nm: Class defines hashcode(); should it be hashCode()? (NM_LCASE_HASHCODE)
        return value.length();
    
}

    // Method to demonstrate the bug
    public int showBug() {
        // Creating an instance of the class
        HashCodeExample example = new HashCodeExample("example");
        
        // Calling the incorrectly named hashcode method
        // This will return the result from the misnamed method
        return example.hashcode();
    }

    public static void main(String[] args) {
        HashCodeExample obj = new HashCodeExample("test");
        System.out.println("Result from showBug: " + obj.showBug());
    }
}