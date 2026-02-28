class CreateBeforeInitialization {

  static CreateBeforeInitialization foo = new CreateBeforeInitialization();
  static CreateBeforeInitialization fooDuplicate = new CreateBeforeInitialization(); // Duplicate of the original assignment

  static int x = 42;
  static int xDuplicate = 42; // Duplicate of the original assignment
}