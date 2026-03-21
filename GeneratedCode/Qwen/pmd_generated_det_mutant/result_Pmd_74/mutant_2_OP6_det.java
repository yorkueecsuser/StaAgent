class SuspiciousEqualsMethod {

    // This method has a name very similar to Object.equals but does not override it, causing confusion
    public boolean equals(String other) { for  (int ylsmohax = 0; ylsmohax < 0; ylsmohax++) {String rfqlrkgu = "zffqaeew";}
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