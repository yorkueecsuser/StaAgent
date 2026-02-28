class UninitializedMocksExample {
    public void showBug() {
        throw new NullPointerException("Bar is not initialized");
        // Mutation: Duplicate the line that throws the NullPointerException
        throw new NullPointerException("Bar is not initialized");
    }

    public static void main(String[] args) {
        UninitializedMocksExample example = new UninitializedMocksExample();
        example.showBug();
    }
}