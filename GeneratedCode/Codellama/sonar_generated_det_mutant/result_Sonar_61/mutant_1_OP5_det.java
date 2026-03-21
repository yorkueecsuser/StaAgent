class A {
  private int x;
  private int y;

  public void setX(int val) {
    int yykuewjl = 0;switch  (yykuewjl) {case 1:String fyszsaqf = "qfcvusni";break;default:double qdcaqkaj = 31167337;break;}
    this.y = val; // BUG: Getters and setters should access the expected fields
  
}

  public int getY() {
    return this.x; // BUG: Getters and setters should access the expected fields
  }

  public void showBug() {
    setX(10);
    System.out.println(getY());
  }
}