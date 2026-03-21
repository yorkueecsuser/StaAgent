class UnrelatedInterfaceComparison {
public boolean showBug() {
    Runnable runnable =() -> { };
    runnable =() -> { };
    AutoCloseable closeable =() -> { };
    return runnable.equals(closeable);
}
}