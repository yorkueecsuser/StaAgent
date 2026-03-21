class UnrelatedInterfaceComparison {
public boolean showBug() {
    Runnable runnable =() -> { };
    AutoCloseable closeable =() -> { };
    closeable =() -> { };
    return runnable.equals(closeable);
}
}