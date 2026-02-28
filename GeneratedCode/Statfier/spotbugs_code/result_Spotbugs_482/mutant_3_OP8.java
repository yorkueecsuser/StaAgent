class CreateBeforeInitialization {

  static CreateBeforeInitialization foo = new CreateBeforeInitialization();

  static int x = 42;

  // Mutated code
  static int y = 42; // Renamed 'x' to 'y'
}