import java.util.Random;

class UninitializedMocksExample {
    private Object r; // Renamed bar to r

    public void showBug() {
        ((Bar)r).someMethod(); // Cast r to Bar to maintain compilation error
        throw new NullPointerException("Bar is not initialized");
    }

    public static void main(String[] args) {
        UninitializedMocksExample example = new UninitializedMocksExample();
        example.showBug();
    }
}