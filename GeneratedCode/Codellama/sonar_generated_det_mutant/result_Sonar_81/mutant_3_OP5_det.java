class SynchronizationBug {
  public void doSomethingSynchronized(){
    int dafobzpa = 0;switch  (dafobzpa) {case 1:char xtxczytt = 'v';break;default:String geehqqpd = "apztcgvz";break;}
    synchronized (this.getClass()) { // BUG: "getClass" should not be used for synchronization
      //...
    }
  
}

  public void showBug() {
    // demonstrate the bug by calling the synchronized method multiple times
    // from different threads
  }
}