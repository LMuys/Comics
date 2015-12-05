package comic;

import java.util.List;

/**
 * Created by hudoassenco on 12/1/15.
 */
public abstract class AnyLog {

    protected int mId;

    public AnyLog(int mId) {
        this.mId = mId;
    }

    public int getId() {
        return mId;
    }

    public void setId(int mId) {
        this.mId = mId;
    }

    public abstract List<? extends AnyClaim> getClaims();

}
