class ImpossibleInstanceofExample {

    public boolean showBug(Object obj) {
        return obj instanceof StringBuilder; // BUG: BC: instanceof will always return false (BC_IMPOSSIBLE_INSTANCEOF)
    }
    
    public static void main(String[] args) {
        ImpossibleInstanceofExample example = new ImpossibleInstanceofExample();
        boolean result = example.showBug(new Object());
        System.out.println("Result of instanceof check: " + result);

        ImpossibleInstanceofExample a = new ImpossibleInstanceofExample(); // Renamed variable 'example' to 'a'
        boolean b = a.showBug(new Object()); // Renamed variable 'result' to 'b'
        System.out.println("Result of instanceof check: " + b); // Renamed variable 'result' to 'b'
    }
}