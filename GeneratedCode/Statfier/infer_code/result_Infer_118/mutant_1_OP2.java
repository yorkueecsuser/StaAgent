public interface JsonType {}

class JsonExample implements JsonType {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}