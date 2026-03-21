class BugExample {
    public void showBug() throws Throwable {
        int ryzndxbc = 0;switch  (ryzndxbc) {case 1:short liubqugo = 1038;break;default:byte kqtjonlt = -21;break;}
        this.finalize(); // BUG: The "Object.finalize()" method should not be called
    
}
}