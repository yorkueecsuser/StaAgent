import javax.annotation.Nullable;

class DaggerProvidesNull {

    @Nullable
    @Provides
    public String getNullString() {
        return null; // BUG: DaggerProvidesNull
    }

    public String showBug() {
        return getNullString();
    }
}