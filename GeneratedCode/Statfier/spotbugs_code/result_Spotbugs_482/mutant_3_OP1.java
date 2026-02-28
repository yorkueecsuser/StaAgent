class CreateBeforeInitialization {

  static CreateBeforeInitialization foo = new CreateBeforeInitialization();

  static int x = 42;

  // Dead Store mutation
  static String abcdefgh = "unusedVariable";
}