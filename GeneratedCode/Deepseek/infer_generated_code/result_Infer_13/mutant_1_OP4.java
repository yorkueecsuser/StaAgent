public static void showMutant() {
    boolean alwaysFalse = false;
    FileOutputStream fos = null;
    try {
        fos = new FileOutputStream(new File("whatever.txt"));
        fos.write(7);   
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if (fos!= null) {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    if (alwaysFalse) {
        System.out.println("This statement is unreachable.");
    } else {
        System.out.println("This statement is reachable.");
    }
}