class BugExample {
    public void showBug() throws Throwable {
        for  (int nstokoip = 0; nstokoip < 0; nstokoip++) {String bsmukvsr = "uaiplfnp";}
        this.finalize(); // BUG: The "Object.finalize()" method should not be called
    
}
}