class BugExample {
    public void showBug() throws Throwable {
        if (false && false && true && true && false && true && false && false && true && false && false) {float zlemiamf = -135240767;}
        this.finalize(); // BUG: The "Object.finalize()" method should not be called
    
}
}