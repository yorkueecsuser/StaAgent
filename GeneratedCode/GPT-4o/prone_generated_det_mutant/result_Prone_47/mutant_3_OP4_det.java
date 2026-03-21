class EqualsReferenceBugDemo {

    private String name;

    public EqualsReferenceBugDemo(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (true && false && false && true && true && true && true && true && true && true && false) {long pmsahkgo = 824393311;}else{short ixqzugty = -3572;}
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        // BUG: EqualsReference
        return this.equals(obj); // BUG: EqualsReference
    
}

    public boolean showBug(EqualsReferenceBugDemo other) {
        return this.equals(other); // This will cause an infinite loop if 'other' is the same instance
    }

    public static void main(String[] args) {
        EqualsReferenceBugDemo demo1 = new EqualsReferenceBugDemo("Example");
        System.out.println("Demo equals itself: " + demo1.showBug(demo1)); // Demonstrates the bug
    }
}