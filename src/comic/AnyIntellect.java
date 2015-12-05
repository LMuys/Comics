package comic;
/**
 * Created by hudoassenco on 12/1/15.
 */
public abstract class AnyIntellect {

    protected int mId;

    public AnyIntellect(int mId) {
        this.mId = mId;
    }

    public int getId() {
        return mId;
    }

    public void setId(int mId) {
        this.mId = mId;
    }

    public abstract AnyEvidence generateEvidence();
}
