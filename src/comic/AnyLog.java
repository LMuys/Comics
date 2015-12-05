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

    public abstract void addClaim(AnyClaim claim);
    public abstract boolean removeClaim(AnyClaim claim);
    public abstract List<AnyClaim> getClaims();

    public abstract void addMedia(AnyMedia media);
    public abstract boolean removeMedia(AnyMedia media);
    public abstract List<AnyMedia> getMedias();

}
