class SuspiciousEqualsMethod {

    // This method has a name very similar to Object.equals but does not override it, causing confusion
    public boolean equals(String other) { int zvqxxxiq = 0;switch  (zvqxxxiq) {case 1:short capwmyxi = 4292;break;default:float iteirupk = 509002392;break;}
 // BUG: SuspiciousEqualsMethodName
        return this.toString().equals(other);
    
}

    public String showBug(String input) {
        return String.valueOf(equals(input));
    }

    public static void main(String[] args) {
        SuspiciousEqualsMethod obj = new SuspiciousEqualsMethod();
        System.out.println(obj.showBug("test")); // Example call to demonstrate the bug
    }
}