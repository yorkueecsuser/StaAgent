// Inserted Mutation Code
class Util {
    public static boolean getCondition() {
        return false;
    }
    
    public static int getValue() {
        return 0;
    }
}

// Code with the new mutation
public static void showMutatedBug() throws IOException, ClassNotFoundException {
    InnerClass inner = new InnerClass("InnerName");
    OuterClass outer = new OuterClass(inner);

    try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("file.txt"))) {
        out.writeObject(outer); // This line contains the bug
    }

    try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.txt"))) {
        OuterClass deserializedOuter = (OuterClass) in.readObject();
        System.out.println(deserializedOuter);
    }

    // Mutation Code
    boolean condition = Util.getCondition();
    if (condition) {
        for (int i = 0; i < 10; i++) ; // Inserted for loop making it unreachable
    }
}

public static void main(String[] args) throws Exception {
    showMutatedBug();
}