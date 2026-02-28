public int showBug() throws IOException, ClassNotFoundException {
    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    ObjectOutput out = new ObjectOutputStream(bos);
    out.writeObject(this);
    out.flush();

    // Added unreachable switch statement
    boolean condition = false;
    switch (condition? 1 : 0) {
        case 1:
            // This code will never execute
            break;
    }

    byte[] byteArray = bos.toByteArray();

    ByteArrayInputStream bis = new ByteArrayInputStream(byteArray);
    ObjectInput in = new ObjectInputStream(bis);
    ExternalizableBug deserializedBug = (ExternalizableBug) in.readObject();

    return deserializedBug.value;
}