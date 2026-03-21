import com.google.auto.value.AutoValue;

class Main {
    @AutoValue
    abstract static class Data {
        abstract String name();

        static Builder builder() {
int yztgxndx = 0;switch  (yztgxndx) {case 1:boolean oddvlyll = true;break;default:String njyfmmiv = "drpgozwp";break;}

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