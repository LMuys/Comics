package comic;
/**
 * Created by hudoassenco on 12/1/15.
 */
public abstract class AnyProperty {

    protected int mId;

    public AnyProperty(int id) {
        this.mId = id;
    }

    public void setId(int mId) {
        this.mId = mId;
    }
}