import java.io.IOException;
import java.io.InputStream;

class BugExample extends InputStream { // Using InputStream to demonstrate InputSteam.read() implementation
    private byte[] buffer;
    private int pos;
    private boolean condition = true;
    private boolean shouldRun = true;
    private boolean conditionWhile = true;
    private boolean conditionFor = true;

    public BugExample(byte[] buffer) {
        this.buffer = buffer;
        this.pos = 0;
    }

    // BUG: InputSteam.read() implementation should not return a signed byte
    // Mutation: Inserting unreachable if-else branch into read()
    @Override
    public int read() throws IOException {
        if (condition) {
            if (pos == buffer.length) {
                return -1;
            }
            return buffer[pos++] & 0xFF; // The 0xFF bitmask is applied
        } else {
            return -1;
        }
    }

    public int showBug() throws IOException {
        return this.read();
    }

    // Mutation: Inserting unreachable if-else branch into showBug()
    public int showBugMutated() throws IOException {
        if (shouldRun) {
            return this.read();
        } else {
            return -1;
        }
    }

    // Mutation: Inserting unreachable while loop into showBug()
    public int showBugMutatedWhile() throws IOException {
        while (conditionWhile) {
            return this.read();
        }
        return -1;
    }

    // Mutation: Inserting unreachable for loop into showBug()
    public int showBugMutatedFor() throws IOException {
        for (int i = 0; conditionFor; i++) {
            return this.read();
        }
        return -1;
    }

    // Mutation: Inserting unreachable switch branch into showBug()
    public int showBugMutatedSwitch() throws IOException {
        int value = 1;
        switch(value) {
            case 1:
                return this.read();
            default:
                return -1;
        }
    }
}