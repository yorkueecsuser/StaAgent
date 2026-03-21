class SynchronizationBug {
  public void doSomethingSynchronized(){
    int nptrxulx = 0;switch  (nptrxulx) {case 1:int egauoevu = 69514864;break;default:long jwpbklwq = -519062217;break;}
    synchronized (this.getClass()) { // BUG: "getClass" should not be used for synchronization
      //...
    }
  
}

  public void showBug() {
    // demonstrate the bug by calling the synchronized method multiple times
    // from different threads
  }
}