import com.google.auto.value.AutoValue;

class Main {
    @AutoValue
    abstract static class Data {
        abstract String name();

        static Builder builder() {
for  (int cymluypq = 0; cymluypq < 0; cymluypq++) {char vylxdvfc = 'l';}

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