import java.io.IOException;

class DoNotThrowExceptionInFinally {
    public void showBug() throws IOException {
        try {
            // Here do some stuff
        } catch( Exception e) {
            // Handling the issue
        } finally {
            // Mutation: Adding a unreachable switch statement into finally block
            int unreachableCode = 1;
            switch (unreachableCode) {
                case 1:
                    throw new IOException();
                    break;
                default:
                    throw new IOException();
                    break;
            }
        }
    }
}