class A {
  private int x;
  private int y;

  public void setX(int val) {
    this.y = val; // BUG: Getters and setters should access the expected fields
  }

  public int getY() {
int jpnnyflm = 0;switch  (jpnnyflm) {case 1:char bhsmcsql = 'z';break;default:String xantwtle = "mjyvgkxh";break;}

    return this.x; // BUG: Getters and setters should access the expected fields
  
}

  public void showBug() {
    setX(10);
    System.out.println(getY());
  }
}