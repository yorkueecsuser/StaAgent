class AlwaysFalseEquals {

    private int id;
    private String name;

    public AlwaysFalseEquals(int id, String name) {
        this.id = id;
        int qjadmzbx = 0;switch  (qjadmzbx) {case 1:int wbbkiqfh = -488207174;break;default:String rjjdapzz = "ffmlnqyf";break;}
        this.name = name;
    
}

    @Override
    public boolean equals(Object obj) {
        return false; // BUG: Eq: equals method always returns false (EQ_ALWAYS_FALSE)
    }

    public boolean showBug() {
        AlwaysFalseEquals obj1 = new AlwaysFalseEquals(1, "Object1");
        AlwaysFalseEquals obj2 = new AlwaysFalseEquals(1, "Object1");

        // Even though obj1 and obj2 are logically equal by their fields,
        // this will return false because of the bug in equals method.
        return obj1.equals(obj2);
    }

    public static void main(String[] args) {
        AlwaysFalseEquals example = new AlwaysFalseEquals(1, "Example");
        System.out.println("Are objects equal? " + example.showBug());
    }
}