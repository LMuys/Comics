package comic;
import java.util.List;

/**
 * Created by hudoassenco on 12/1/15.
 */
public class CreditLog extends AnyLog {

    private List<AuthorClaim> mClaims;

    public CreditLog(int id, List<AuthorClaim> mClaims) {
        super(id);

        this.mClaims = mClaims;
    }

    @Override
    public List<? extends AnyClaim> getClaims() {
        return mClaims;
    }

    public void addClaim(AuthorClaim authorClaim) {
        mClaims.add(authorClaim);
    }

    public boolean removeClaim(AuthorClaim authorClaim) {
        return mClaims.remove(authorClaim);
    }
}
