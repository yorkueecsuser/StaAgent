@interface ForNonUiThread {}

class DummyClass {
    private int originalVariable;

    public void someMethod() {
        int localVariable = 10;
        originalVariable = localVariable + 5;
    }
}

// Mutated version with renamed variable
class DummyClassMutant {
    private int a; // Renamed from originalVariable to 'a'

    public void someMethod() {
        int localVariable = 10;
        a = localVariable + 5; // Updated to use the renamed variable 'a'
    }
}