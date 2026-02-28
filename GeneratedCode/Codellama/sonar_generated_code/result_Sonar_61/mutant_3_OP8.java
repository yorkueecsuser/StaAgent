class A {
  private int x;
  private int y;

  public void setX(int val) {
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

//Mutation Operator name: Renaming
//Mutation Operator description: Renaming user-defined variables declared in a program. If there exist multiple variables, we randomly select one for the mutation. The new name of the variable will be in the form of [a-z].
//Core Requirements:
//1. Generated mutated Java code MUST maintain the original code (the original code must be left in place, do not remove from it only add code to it).
//2. Generated mutated Java code MUST compile successfully.
//3. Mutant code being added MUST be unique not generic.
//4. Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
//5. Generated mutated Java code MUST avoid unreachable statement error.

//Mutated code:
class A {
  private int x;
  private int y;

  public void setX(int val) {
    this.y = val; // BUG: Getters and setters should access the expected fields
  }

  public int getY() {
    return this.x; // BUG: Getters and setters should access the expected fields
  }

  public void showBug() {
    setX(10);
    System.out.println(getY());
  }

  //Mutant 1: Renaming variable 'x' to 'a'
  class A {
    private int a;
    private int y;

    public void setX(int val) {
      this.y = val; // BUG: Getters and setters should access the expected fields
    }

    public int getY() {
      return this.a; // BUG: Getters and setters should access the expected fields
    }

    public void showBug() {
      setX(10);
      System.out.println(getY());
    }
  }

  //Mutant 2: Renaming variable 'y' to 'b'
  class A {
    private int x;
    private int b;

    public void setX(int val) {
      this.b = val; // BUG: Getters and setters should access the expected fields
    }

    public int getY() {
      return this.x; // BUG: Getters and setters should access the expected fields
    }

    public void showBug() {
      setX(10);
      System.out.println(getY());
    }
  }

}