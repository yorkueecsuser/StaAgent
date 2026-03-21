class BugExample {
    public void showBug() throws Throwable {
        if (true && true && true && false && true && false && false && true && true && true && false) {boolean erxnfhvk = true;}else{boolean olwpqzjx = true;}
        this.finalize(); // BUG: The "Object.finalize()" method should not be called
    
}
}