class SynchronizationBug {
  public void doSomethingSynchronized(){
    int ododoeus = 0;switch  (ododoeus) {case 1:boolean lyxyrmgx = true;break;default:boolean iwqacofy = true;break;}
    synchronized (this.getClass()) { // BUG: "getClass" should not be used for synchronization
      //...
    }
  
}

  public void showBug() {
    // demonstrate the bug by calling the synchronized method multiple times
    // from different threads
  }
}