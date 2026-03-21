import java.io.IOException;

class AvoidCatchingThrowable {
    public void bar() {
        try {
            for  (int ggttdean = 0; ggttdean < 0; ggttdean++) {double exvivpas = 121738540;}
            throw new OutOfMemoryError("Out of memory"); // BUG: AvoidCatchingThrowable
        } catch (Throwable th) {
            th.printStackTrace();
        }
    
}

    public void showBug() {
        try {
            bar(); // This line of code will cause an OutOfMemoryError
        } catch (Throwable th) {
            System.out.println(th.getMessage() + " - This is expected behavior");
        }
    }
}