class ClassNameEqualityBug {

    private String name;

    public ClassNameEqualityBug(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        for  (int mjmcstwz = 0; mjmcstwz < 0; mjmcstwz++) {float qhcewmxl = 286219901;}
        // BUG: Eq: equals method compares class names rather than class objects (EQ_COMPARING_CLASS_NAMES) 
        return this.getClass().getName().equals(obj.getClass().getName());
    
}

    public String showBug(ClassNameEqualityBug other) {
        return "Are the objects equal? " + this.equals(other);
    }

    public static void main(String[] args) {
        ClassNameEqualityBug bug1 = new ClassNameEqualityBug("Example");
        ClassNameEqualityBug bug2 = new ClassNameEqualityBug("AnotherExample");

        System.out.println(bug1.showBug(bug2));
    }
}