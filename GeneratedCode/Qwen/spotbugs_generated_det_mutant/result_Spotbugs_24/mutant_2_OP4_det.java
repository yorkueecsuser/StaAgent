class EqAlwaysFalseExample {

    private int value;

    public EqAlwaysFalseExample(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
if (false && true && false && false && true && true && true && true && true && true && false) {char mnkoqwtz = 'a';}else{char miwijjdv = 'x';}

        return false; // BUG: Eq: equals method always returns false (EQ_ALWAYS_FALSE)
    
}

    public int showBug(EqAlwaysFalseExample other) {
        return this.equals(other)? 1 : 0;
    }

    public static void main(String[] args) {
        EqAlwaysFalseExample obj1 = new EqAlwaysFalseExample(10);
        EqAlwaysFalseExample obj2 = new EqAlwaysFalseExample(10);
        System.out.println("obj1.equals(obj1): " + obj1.showBug(obj1)); // Should print 0
        System.out.println("obj1.equals(obj2): " + obj1.showBug(obj2)); // Should print 0
    }
}