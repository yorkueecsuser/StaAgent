class BugExample {
    public void showBug() throws Throwable {
        if (false && false && true && true && true && true && false && false && false && false && false) {short zawdovkc = -3365;}
        this.finalize(); // BUG: The "Object.finalize()" method should not be called
    
}
}