package comic;
import java.util.Date;

/**
 * Created by hudoassenco on 12/1/15.
 */
public class AuthorContractProperty extends AnyProperty {

    private String mAuthorName;

    private Date mContractStartDate;
    private Date mContractEndDate;
    
    private AnyClaim mAssociatedClaim;

    public AuthorContractProperty(int id, String mAuthorName, Date mContractStartDate, Date mContractEndDate, AnyClaim mAssociatedClaim) {
        super(id);

        this.mAuthorName = mAuthorName;
        this.mContractStartDate = mContractStartDate;
        this.mContractEndDate = mContractEndDate;
        this.mAssociatedClaim = mAssociatedClaim;
    }

    public String getAuthorName() {
        return mAuthorName;
    }

    public Date getContractStartDate() {
        return mContractStartDate;
    }

    public Date getContractEndDate() {
        return mContractEndDate;
    }

    public AnyClaim getAssociatedClaim() {
    	return mAssociatedClaim;
    }

    public void setAuthorName(String mAuthorName) {
        this.mAuthorName = mAuthorName;
    }

    public void setContractStartDate(Date mContractStartDate) {
        this.mContractStartDate = mContractStartDate;
    }

    public void setContractEndDate(Date mContractEndDate) {
        this.mContractEndDate = mContractEndDate;
    }

    public void setAssociatedClaim(AnyClaim mAssociatedClaim) {
        this.mAssociatedClaim = mAssociatedClaim;
    }
}
