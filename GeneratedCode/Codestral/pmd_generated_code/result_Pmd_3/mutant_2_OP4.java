public void showBug() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException {
    // Bug: Calling setAccessible(true) to access private constructor and method
    Constructor<?> constructor = this.getClass().getDeclaredConstructor();
    constructor.setAccessible(true); // BUG: AvoidAccessibilityAlteration
    constructor.newInstance();

    Method privateMethod = this.getClass().getDeclaredMethod("privateMethod");
    privateMethod.setAccessible(true); // BUG: AvoidAccessibilityAlteration

    // Mutant code: Unreachable if-else statement
    boolean alwaysFalse = false;
    if (alwaysFalse) {
        // This code will never execute
        System.out.println("This is an unreachable if block.");
    } else {
        // This is the normal execution flow
        privateMethod.invoke(this);
    }
}