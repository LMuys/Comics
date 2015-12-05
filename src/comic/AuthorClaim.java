package comic;
import java.util.ArrayList;
import java.util.List;

public class AuthorClaim extends AnyClaim {

	private AuthorContractProperty mClaimedProperty;
	private int mClaimOverIntellectId;
	private ArrayList<AnyEvidence> mEvidences;

	public AuthorClaim(int mId, AuthorContractProperty claimedProperty, int claimOverIntellectId, ArrayList<AnyEvidence> evidences) {
		super(mId);
		this.mClaimedProperty =  claimedProperty;
		this.mClaimOverIntellectId = claimOverIntellectId;
		this.mEvidences = evidences;
	}

	public void addEvidenceToClaim(AnyEvidence evidence) {
		this.mEvidences.add(evidence);
	}

	public int getClaimOverIntellectId() {
		return mClaimOverIntellectId;
	}

	public void setClaimOverIntellectId(int claimOverIntellectId) {
		this.mClaimOverIntellectId = claimOverIntellectId;
	}

	public AuthorContractProperty getProperty() {
		return mClaimedProperty;
	}
	
	public List<AnyEvidence> getEvidence() {
		return mEvidences;
	}
	
	public void recordOnLog(AnyLog log) {
		
	}
}
