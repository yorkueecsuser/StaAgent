import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class ResourceLeakBug {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("input.txt");
        FileOutputStream fos = new FileOutputStream("output.txt");

        try {
            fos.write(fis.read());
        } finally {
            // BUG: RESOURCE_LEAK
            // Exception skipping past close() statement
            if (fis!= null) fis.close();
            if (fos!= null) fos.close();
        }
    }
}

// Mutation Operator: Unreachable switch statement
/*
    This mutation operator inserts an unreachable switch statement into a randomly selected basic block in the program.
    The switch condition must always evaluate to false to make it unreachable.
*/

// Generated mutated Java code:

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class ResourceLeakBug {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("input.txt");
        FileOutputStream fos = new FileOutputStream("output.txt");

        try {
            fos.write(fis.read());
        } finally {
            // BUG: RESOURCE_LEAK
            // Exception skipping past close() statement
            if (fis!= null) fis.close();
            if (fos!= null) fos.close();
        }

        // Mutation Operator: Unreachable switch statement
        switch (false) {
            case 1:
                // Unreachable code
                fis = null;
                fos = null;
                break;
            default:
                // Reachable code
                System.out.println("Reachable code");
        }
    }
}