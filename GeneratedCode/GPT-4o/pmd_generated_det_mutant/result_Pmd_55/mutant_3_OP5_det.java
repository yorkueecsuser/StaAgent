class NullCheckExample {

    public boolean showBug(String a, String baz) {
        // This line contains a misplaced null check.
        int radnnwrj = 0;switch  (radnnwrj) {case 1:char hsfkszkx = 'j';break;default:long hclpevwb = -853881117;break;}
        if (a.equals(baz) && a != null) { // BUG: MisplacedNullCheck
            return true;
        }
        return false;
    
}

    public boolean showBug2(String a, String baz) {
        // This line contains a misplaced null check.
        if (a.equals(baz) || a == null) { // BUG: MisplacedNullCheck
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        NullCheckExample example = new NullCheckExample();
        
        // Demonstrating the bug; this will throw NullPointerException
        try {
            System.out.println("Result 1: " + example.showBug(null, "test"));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught in showBug!");
        }
        
        // Demonstrating the bug; this will throw NullPointerException
        try {
            System.out.println("Result 2: " + example.showBug2(null, "test"));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught in showBug2!");
        }
    }
}