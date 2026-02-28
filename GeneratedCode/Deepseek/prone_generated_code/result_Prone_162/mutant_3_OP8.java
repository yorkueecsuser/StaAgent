import java.io.IOException;

class BugExample {

    public void showBug() throws IOException {
        throwIfUnchecked(new IOException()); // BUG: ThrowIfUncheckedKnownChecked
    }

    private void throwIfUnchecked(Throwable t) {
        if (t instanceof RuntimeException) {
            throw (RuntimeException) t;
        } else if (t instanceof Error) {
            throw (Error) t;
        }
    }

    // Mutation Operator: Renaming
    // Mutation Operator description: Renaming user-defined variables declared in a program. 
    // If there exist multiple variables, we randomly select one for the mutation. 
    // The new name of the variable will be in the form of [a-z].
    private void throwIfUncheckedMutant(Throwable t) {
        if (t instanceof RuntimeException) {
            throw (RuntimeException) t;
        } else if (t instanceof Error) {
            throw (Error) t;
        }
    }
}