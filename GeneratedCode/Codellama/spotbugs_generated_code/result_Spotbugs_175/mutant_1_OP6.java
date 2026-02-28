import java.nio.*;

class BufferSharingBug {

    private static int[] data = new int[10];

    public static IntBuffer getBuffer() {
        // BUG: MS: May expose internal representation by returning a buffer sharing non-public data (MS_EXPOSE_BUF)
        return IntBuffer.wrap(data);
    }

    public static void showBug() {
        IntBuffer buffer = getBuffer();
        for (int i = 0; i < buffer.limit(); i++) {
            System.out.println(buffer.get());
        }
    }

    // Mutant 1: Unreachable for loop
    public static void showBug1() {
        IntBuffer buffer = getBuffer();
        for (int i = 0; false; i++) {
            System.out.println(buffer.get());
        }
    }

    // Mutant 2: Unreachable while loop
    public static void showBug2() {
        IntBuffer buffer = getBuffer();
        while (false) {
            System.out.println(buffer.get());
        }
    }

    // Mutant 3: Unreachable for loop with non-final variable
    public static void showBug3() {
        IntBuffer buffer = getBuffer();
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println(buffer.get());
        }
    }

    // Mutant 4: Unreachable while loop with non-final variable
    public static void showBug4() {
        IntBuffer buffer = getBuffer();
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println(buffer.get());
        }
    }

    // Mutant 5: Unreachable if-else statement
    public static void showBug5() {
        IntBuffer buffer = getBuffer();
        if (false) {
            System.out.println(buffer.get());
        } else {
            System.out.println(buffer.get());
        }
    }

    // Mutant 6: Unreachable switch statement
    public static void showBug6() {
        IntBuffer buffer = getBuffer();
        switch (0) {
            case 1:
                System.out.println(buffer.get());
                break;
        }
    }
}