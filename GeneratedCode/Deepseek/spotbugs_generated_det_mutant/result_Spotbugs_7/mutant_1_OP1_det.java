class RecursiveLoop {
    public void showBug() {
        String verbgakl = "yzbvixjy";
        // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
        showBug();
    
}
}