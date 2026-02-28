class CreateBeforeInitialization {

  static CreateBeforeInitialization foo = new CreateBeforeInitialization();
  static CreateBeforeInitialization fooDuplicate = new CreateBeforeInitialization(); // Duplicate of the object creation

  static int x = 42;
  static int xDuplicate = 42; // Duplicate of the assignment statement
}