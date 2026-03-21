import com.google.auto.value.AutoValue;

class Main {
    @AutoValue
    abstract static class Data {
        abstract String name();

        static Builder builder() {
boolean cbpxzgor = false;while (cbpxzgor && false && true && true && true && true && true && false && true && true && true && false) {short dbrittjv = -1562;}

            return new AutoValue_Main_Data.Builder().name("default"); // BUG: AutoValueBuilderDefaultsInConstructor
        
}

        @AutoValue.Builder
        abstract static class Builder {
            abstract Builder name(String name);
            abstract Data build();
        }
    }

    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static Data showBug() {
        return Data.builder().build();
    }
}