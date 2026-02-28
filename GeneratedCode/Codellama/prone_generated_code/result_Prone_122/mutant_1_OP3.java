class NullTernary {
    public static void main(String[] args) {
        Integer foo = null;
        boolean flag = false;
        int x = flag? foo : null;
        System.out.println(x);
        if (getCondition()) {
            // do something
        }
    }

    private static boolean getCondition() {
        // return a dynamically determined condition at runtime
        return false;
    }
}