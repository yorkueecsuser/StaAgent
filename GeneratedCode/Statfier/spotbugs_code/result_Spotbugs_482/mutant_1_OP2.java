class CreateBeforeInitialization {

  static CreateBeforeInitialization foo = new CreateBeforeInitialization();

  static int x = 42;
  static int x = 42; // Duplicate assignment statement
}