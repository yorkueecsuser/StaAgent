class FinalizeBugExample {

    // BUG: The signature of "finalize()" should match that of "Object.finalize()"
    public int finalize(int someParameter) {
        System.out.println("This is not the correct finalize method.");
        return someParameter;
    }

    public void showBug(int param) {
        int result = finalize(param);
        System.out.println("Result from buggy finalize method: " + result);
    }

    public static void main(String[] args) {
        FinalizeBugExample example = new FinalizeBugExample();
        example.showBug(42);
    }

    // Mutated code
    public int finalize(char x) {
        System.out.println("This is not the correct finalize method.");
        return x;
    }

    public void showBug(byte b) {
        byte y = (byte) finalize(b);
        System.out.println("Result from buggy finalize method: " + y);
    }
}