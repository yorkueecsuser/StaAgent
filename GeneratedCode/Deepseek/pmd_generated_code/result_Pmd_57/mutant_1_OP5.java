class Foo {
    private Foo() {}
    void foo() {}
    // BUG: MissingStaticMethodInNonInstantiatableClass

    public static void showBug() {
        Foo f = new Foo(); // This will throw a compilation error
        // 'Foo()' has private access in 'Foo'
    }

    // Mutated switch statement
    public void mutatedSwitch() {
        boolean mutationCondition = false;
        switch(mutationCondition? 1 : 0) {} // This switch statement is unreachable
    }
}