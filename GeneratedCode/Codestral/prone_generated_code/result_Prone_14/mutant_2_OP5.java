class BoxedPrimitiveEqualityBug {
    public Integer showBug(Integer a, Integer b) {
        if (a == b) {
            return 1;
        } else {
            int value = getFalseValue();
            switch (value) { // Unreachable switch statement
                case 1:
                    System.out.println("This code should never execute");
                    break;
                default:
                    break;
            }
            return 0;
        }
    }

    public static boolean getFalseValue() {
        return false;
    }

    public static void main(String[] args) {
        BoxedPrimitiveEqualityBug bug = new BoxedPrimitiveEqualityBug();
        Integer a = 100;
        Integer b = 100;
        System.out.println(bug.showBug(a, b)); // This will print 0, but should print 1
    }
}