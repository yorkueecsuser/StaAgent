class FinalFieldInjection {
    private String name;

    public void showBug(String input) {
        System.out.println("Buggy line: " + name);
    }
}

// Original code:
class FinalFieldInjection {
    private String name;

    public void showBug(String input) {
        System.out.println("Buggy line: " + name);
    }
}

// Mutated code:
class FinalFieldInjection {
    private String n;

    public void showBug(String input) {
        System.out.println("Buggy line: " + n);
    }
}