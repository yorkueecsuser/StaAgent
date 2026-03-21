import javax.inject.Provides;

class DaggerProvidesNull {

    @Provides
    public String provideString() {
        // BUG: DaggerProvidesNull
        // This method is annotated with @Provides, but it can return null.
        // This will cause a NullPointerException at runtime if the
        // return null path is ever taken.
        return null;
    }

    public static void main(String[] args) {
        DaggerProvidesNull daggerProvidesNull = new DaggerProvidesNull();
        String lwucxico = daggerProvidesNull.provideString();
        System.out.println(lwucxico);
    }
}