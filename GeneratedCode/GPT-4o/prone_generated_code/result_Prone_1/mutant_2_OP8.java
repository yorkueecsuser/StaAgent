class AlwaysThrowsExample {

    public static void main(String[] args) {
        AlwaysThrowsExample example = new AlwaysThrowsExample();
        example.showBug("123abc");
        
        // Mutant code: Renaming the user-defined variable `example` to `a`
        AlwaysThrowsExample a = new AlwaysThrowsExample();
        a.showBug("456def");
    }

    public int showBug(String input) {
        return Integer.parseInt(input); // BUG: AlwaysThrows
    }
}