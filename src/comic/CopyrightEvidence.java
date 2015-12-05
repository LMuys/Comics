package comic;
import java.util.Date;

/**
 * Created by hudoassenco on 12/1/15.
 */
public class CopyrightEvidence extends AnyEvidence {

    private String mAuthorName;
    private int mIntellectId;
    private Date mDate;

    public CopyrightEvidence(int mId, String mAuthorName, int intellectId, Date mDate) {
        super(mId);

        this.mAuthorName = mAuthorName;
        this.mIntellectId = intellectId;
        this.mDate = mDate;
    }

    public String getAuthorName() {
        return mAuthorName;
    }

    public void setAuthorName(String mAuthorName) {
        this.mAuthorName = mAuthorName;
    }

    public int getIntellectId() {
        return mIntellectId;
    }

    public void setIntellectId(int intellectId) {
        this.mIntellectId = intellectId;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date mDate) {
        this.mDate = mDate;
    }

    @Override
    public boolean validateClaim(AnyClaim claim) {
        if(claim instanceof AuthorClaim) {
            AuthorContractProperty authorContractProperty = ((AuthorClaim) claim).getProperty();

            String authorName = authorContractProperty.getAuthorName();
            int intellectId = ((AuthorClaim) authorContractProperty.getAssociatedClaim()).getClaimOverIntellectId();

            return (authorName.equals(mAuthorName) && intellectId == mIntellectId);
        }
        return false;
    }
}
