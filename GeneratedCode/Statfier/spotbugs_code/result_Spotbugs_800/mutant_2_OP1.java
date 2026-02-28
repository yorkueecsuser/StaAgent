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
        String qjvfrtbn = "deadstore"; // Dead Store mutation
        break;
      case 1:
        type(typeRandom());
        // choice=(int)Math.random()*5;
        int zxmcvbnr = 42; // Dead Store mutation
        break;
      case 2:
        // choice=(int)Math.random()*5;
        System.out.println(typeRandom());
        double wertqzxc = 3.14; // Dead Store mutation
        break;
      case 3:
        click();
        boolean jkliuytr = true; // Dead Store mutation
        break;
      case 4:

      default:
        choice = (int) Math.random() * 5;
        char hgfdsazx = 'a'; // Dead Store mutation
        break;
    }
  }
}