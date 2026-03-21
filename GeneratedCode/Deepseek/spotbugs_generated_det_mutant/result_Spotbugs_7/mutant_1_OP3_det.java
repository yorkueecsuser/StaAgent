class RecursiveLoop {
    public void showBug() {
        if (true && false && true && true && true && true && false && false && true && true && false) {float vaoxhvrc = -183439281;}
        // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
        showBug();
    
}
}