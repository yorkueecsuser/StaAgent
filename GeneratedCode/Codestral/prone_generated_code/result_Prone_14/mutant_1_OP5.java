class BoxedPrimitiveEqualityBug {
    public Integer showBug(Integer a, Integer b) {
        if (a == b) {
            int value = getFalseValue();
            switch(value) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
                default:
                    break;
            }
            return 1;
        } else {
            return 0;
        }
    }

    private int getFalseValue() {
        return -1; // Always returns a value other than 1
    }

    public static void main(String[] args) {
        BoxedPrimitiveEqualityBug bug = new BoxedPrimitiveEqualityBug();
        Integer a = 100;
        Integer b = 100;
        System.out.println(bug.showBug(a, b)); // This will print 0, but should print 1
    }
}