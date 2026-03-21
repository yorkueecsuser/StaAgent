class BugExample {
    public void showBug() throws Throwable {
        int tlhaxpvi = 0;switch  (tlhaxpvi) {case 1:boolean qdemxymm = false;break;default:byte mvxqmnfc = 74;break;}
        this.finalize(); // BUG: The "Object.finalize()" method should not be called
    
}
}