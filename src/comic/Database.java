package comic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hudoassenco on 12/4/15.
 */
//Simulates a Databse
public class Database extends AnyLog {

    private List<AnyClaim> mClaims;
    private List<AnyMedia> mMedias;

    public Database(int mId) {
        super(mId);

        mClaims = new ArrayList<AnyClaim>();
        mMedias = new ArrayList<AnyMedia>();
    }

    @Override
    public void addClaim(AnyClaim claim) {
        mClaims.add(claim);
    }

    @Override
    public boolean removeClaim(AnyClaim claim) {
        return mClaims.remove(claim);
    }

    @Override
    public List<AnyClaim> getClaims() {
        return mClaims;
    }

    @Override
    public void addMedia(AnyMedia media) {
        mMedias.add(media);
    }

    @Override
    public boolean removeMedia(AnyMedia media) {
        return mMedias.remove(media);
    }

    @Override
    public List<AnyMedia> getMedias() {
        return mMedias;
    }
}
