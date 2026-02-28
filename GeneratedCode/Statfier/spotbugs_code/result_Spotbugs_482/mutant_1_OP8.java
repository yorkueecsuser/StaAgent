class CreateBeforeInitialization {

  static CreateBeforeInitialization foo = new CreateBeforeInitialization();

  static int x = 42;

  // Mutated code
  static CreateBeforeInitialization bar = new CreateBeforeInitialization();
  static int y = 42;
}