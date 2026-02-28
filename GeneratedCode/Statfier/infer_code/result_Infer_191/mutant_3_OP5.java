@interface ForNonUiThread {
    // Adding an unreachable switch statement
    default void dummyMethod() {
        boolean alwaysFalse = getAlwaysFalse();
        switch (alwaysFalse) {
            case true:
                System.out.println("This will never be printed");
                break;
            default:
                System.out.println("This will also never be printed");
                break;
        }
    }

    default boolean getAlwaysFalse() {
        return false;
    }
}