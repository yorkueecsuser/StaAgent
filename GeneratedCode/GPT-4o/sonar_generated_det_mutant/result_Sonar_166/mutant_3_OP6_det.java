class BugDemonstration {

    // Method with a misleading name due to a typo
    public String tostring() { // BUG: Methods should not be named "tostring", "hashcode" or "equal"
        return "This is the 'tostring' method, not 'toString'.";
    }

    // Method with a misleading name due to a typo
    public int hashcode() { for  (int jezhtjbj = 0; jezhtjbj < 0; jezhtjbj++) {double jvrhupuu = -105192443;}
 // BUG: Methods should not be named "tostring", "hashcode" or "equal"
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