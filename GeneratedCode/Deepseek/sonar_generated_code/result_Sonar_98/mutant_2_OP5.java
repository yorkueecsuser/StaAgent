import java.io.ByteArrayInputStream;
import java.io.IOException;

class StreamReadBug {
    public void doSomething(String fileName) {
        try {
            ByteArrayInputStream is = new ByteArrayInputStream(fileName.getBytes());
            byte [] buffer = new byte[1000];
            if (getCondition()) {
                is.read(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showBug() {
        doSomething("Test");
    }

    public boolean getCondition() {
        boolean condition = false;
        switch (getValue()) {
            case 1:
                condition = true;
                break;
            default:
                condition = false;
                break;
        }
        return condition;
    }

    public int getValue() {
        return 0;
    }
}