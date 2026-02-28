class BoxedPrimitiveEqualityBug {
    public Integer showBug() {
        Integer x = new Integer(123);
        Integer y = new Integer(123);
        if (x == y) {
            return x; // BUG: BoxedPrimitiveEquality
        } else {
            boolean shouldRun = true; // added mutation
            while (shouldRun) { // added mutation
                switch (0) { // added mutation
                    case 1: // added mutation
                        shouldRun = false; // added mutation
                        break;
                    default:
                        break;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        BoxedPrimitiveEqualityBug bug = new BoxedPrimitiveEqualityBug();
        Integer result = bug.showBug();
        if (result!= null) {
            System.out.println(result);
        } else {
            System.out.println("No bug found");
        }
    }
}