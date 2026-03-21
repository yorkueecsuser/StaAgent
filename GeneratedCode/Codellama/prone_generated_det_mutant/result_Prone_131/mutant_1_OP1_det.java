import java.util.*;

class ParcelableCreatorBug implements Parcelable {
    private String name;
    private int age;

    public ParcelableCreatorBug(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected ParcelableCreatorBug(Parcel in) {
        name = in.readString();
        age = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(age);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Parcelable.Creator<ParcelableCreatorBug> CREATOR = new Parcelable.Creator<ParcelableCreatorBug>() {
        @Override
        public ParcelableCreatorBug createFromParcel(Parcel in) {
            return new ParcelableCreatorBug(in);
        }

        @Override
        public ParcelableCreatorBug[] newArray(int size) {
boolean yheqhwvh = true;

            return new ParcelableCreatorBug[size];
        
}
    };

    public static void main(String[] args) {
        ParcelableCreatorBug p = new ParcelableCreatorBug("John", 30);
        Parcel parcel = Parcel.obtain();
        p.writeToParcel(parcel, 0);
        parcel.setDataPosition(0);
        ParcelableCreatorBug p2 = Parcelable.Creator.createFromParcel(parcel);
        parcel.recycle();
        System.out.println(p2.name + " " + p2.age);
    }
}