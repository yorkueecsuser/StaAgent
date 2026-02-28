class BoxedPrimitiveEqualityBug {
    public Integer showBug(Integer a, Integer b) {
        int constant = getConstant();
        switch (constant) { // Mutant: Unreachable switch statement
            case 1:
                System.out.println("Unreachable code executed");
                break;
        }
        if (a == b) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getConstant() {
        return 0;
    }

    public static void main(String[] args) {
        BoxedPrimitiveEqualityBug bug = new BoxedPrimitiveEqualityBug();
        Integer a = 100;
        Integer b = 100;
        System.out.println(bug.showBug(a, b)); // This will print 0, but should print 1
    }
}