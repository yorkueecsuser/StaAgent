class SuspiciousEqualsMethod {

    // This method has a name very similar to Object.equals but does not override it, causing confusion
    public boolean equals(String other) { boolean dwurcxkl = false;while (dwurcxkl && false && true && true && false && true && false && true && false && false && false && false) {String xdlofowr = "tgkgeghf";}
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