import java.io.Serializable;

class SerializableClass extends NonSerializableClass implements Serializable {
    // after deserialization, "field3" will have the previously serialized value.
    private int field3;

    // deserialization does not use declared constructors
    public SerializableClass(int field3) {
        super(field3 * 2);
        this.field3 = field3;
    }
}

class NonSerializableClass {
    private int field;
    // this class can not be deserialized because it does not have any implicit or explicit no-argument constructor
    public NonSerializableClass(int field) {
        this.field = field;
    }
}