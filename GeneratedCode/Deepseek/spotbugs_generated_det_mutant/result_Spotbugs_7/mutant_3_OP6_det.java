class RecursiveLoop {
    public void showBug() {
        for  (int sjbawdnn = 0; sjbawdnn < 0; sjbawdnn++) {int wsfyliod = 179865892;}
        // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
        showBug();
    
}
}