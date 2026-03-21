class BugExample {
    public void showBug() throws Throwable {
        int pxrngkzo = 0;switch  (pxrngkzo) {case 1:short bqrcwldx = -4656;break;default:boolean lrrmyrmx = false;break;}
        this.finalize(); // BUG: The "Object.finalize()" method should not be called
    
}
}