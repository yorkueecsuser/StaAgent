class RandomStuff {

  public void click() {}

  public void type(int x) {}

  public int typeRandom() {
    return 1;
  }

  public void screwAround() {
    int choice = (int) (Math.random() * 5);
    switch (choice) {
      case 0:
        click();
        click();
        // choice=(int)Math.random()*5;
        String qwerasdf = "abcdefgh"; // Dead store
        break;
      case 1:
        type(typeRandom());
        // choice=(int)Math.random()*5;
        int jklpoiuy = 12345678; // Dead store
        break;
      case 2:
        // choice=(int)Math.random()*5;
        System.out.println(typeRandom());
        double zxcvbnm = 3.141592; // Dead store
        break;
      case 3:
        click();
        boolean cvbnmzxc = true; // Dead store
        break;
      case 4:

      default:
        choice = (int) Math.random() * 5;
        char vbnmxcvb = 'a'; // Dead store
        break;
    }
  }
}