package comic;

/**
 * Created by hudoassenco on 12/4/15.
 */
public class CopyrightEvidence extends AnyEvidence{

    public CopyrightEvidence(int mId) {
        super(mId);
    }

    @Override
    public boolean validateClaim(AnyClaim claim) {
        return false;
    }
}
