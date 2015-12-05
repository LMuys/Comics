package comic;

/**
 * Created by hudoassenco on 12/4/15.
 */
public abstract class AnyType {

    private int mId;

    public AnyType(int id) {
        mId = id;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }
}