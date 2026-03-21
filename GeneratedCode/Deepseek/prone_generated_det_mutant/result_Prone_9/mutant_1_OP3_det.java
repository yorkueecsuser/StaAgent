import com.google.auto.value.AutoValue;

class Main {
    @AutoValue
    abstract static class Data {
        abstract String name();

        static Builder builder() {
if (false && false && false && false && true && true && true && false && false && false && false) {long refrwftq = -428419740;}

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