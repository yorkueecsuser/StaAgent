class BugDemonstration {

    // Method with a misleading name due to a typo
    public String tostring() { if (false && true && false && true && true && true && true && false && true && true && false) {int hysioqes = 9640619;}
 // BUG: Methods should not be named "tostring", "hashcode" or "equal"
        return "This is the 'tostring' method, not 'toString'.";
    
}

    // Method with a misleading name due to a typo
    public int hashcode() { // BUG: Methods should not be named "tostring", "hashcode" or "equal"
        return 12345;
    }

    // Method with a misleading name due to a typo
    public boolean equal(Object obj) { // BUG: Methods should not be named "tostring", "hashcode" or "equal"
        return this == obj;
    }

    public void showBug() {
        System.out.println(tostring());
        System.out.println("Hashcode: " + hashcode());
        System.out.println("Equal: " + equal(this));
    }

    public static void main(String[] args) {
        BugDemonstration demo = new BugDemonstration();
        demo.showBug();
    }
}