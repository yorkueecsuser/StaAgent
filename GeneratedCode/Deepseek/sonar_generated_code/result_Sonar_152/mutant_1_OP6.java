public static void showBug() throws IOException, ClassNotFoundException {
    InnerClass inner = new InnerClass("InnerName");
    OuterClass outer = new OuterClass(inner);

    try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("file.txt"))) {
        out.writeObject(outer); // This line contains the bug
    }
    finally {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.txt"))) {
            OuterClass deserializedOuter = (OuterClass) in.readObject();
            System.out.println(deserializedOuter);
        }
    }
}