public void showBug() throws Exception {
    File file = new File("test.ser");

    // BUG: Files opened in append mode should not be used with "ObjectOutputStream"
    FileOutputStream fileOut = new FileOutputStream(file, true);
    ObjectOutputStream out = new ObjectOutputStream(fileOut);

    out.writeObject("bug");
    out.close();
    fileOut.close();

    // Mutation: Inserting an unreachable if statement
    if (false) {
        // unreachable code, should not be executed
        System.out.println("This code is unreachable");
    }
}