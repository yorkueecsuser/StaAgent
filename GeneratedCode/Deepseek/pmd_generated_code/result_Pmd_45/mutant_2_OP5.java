import java.lang.System;

class FinalizeOverloaded {
    protected void finalize(int a) { // BUG: FinalizeOverloaded
        System.out.println("This is confusing and probably a bug");
    }

    public static void showBug() {
        FinalizeOverloaded fo = new FinalizeOverloaded();
        fo.finalize(1);
        boolean condition = false;
        if (condition) {
            int value = getValue();
            switch (value) {
            }
        }
    }

    public static void main(String[] args) {
        showBug();
    }

    private static int getValue() {
        return 1;
    }
}