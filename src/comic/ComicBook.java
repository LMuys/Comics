package comic;
import java.util.List;

/**
 * Created by hudoassenco on 12/1/15.
 */
public class ComicBook extends AnyMedia {

    private String mName;
    private int mIssueNumber;
    private List<CreditLog> mCredits;

    public ComicBook(int mId, String name, int issueNumber, List<CreditLog> credits) {
        super(mId);

        this.mName = name;
        this.mIssueNumber = issueNumber;
        this.mCredits = credits;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public int getIssueNumber() {
        return mIssueNumber;
    }

    public void setIssueNumber(int mIssueNumber) {
        this.mIssueNumber = mIssueNumber;
    }

    @Override
    public List<? extends AnyLog> getLogs() {
        return mCredits;
    }

    public void addLog(CreditLog creditLog) {
        mCredits.add(creditLog);
    }

    public boolean removeLog(CreditLog creditLog) {
        return mCredits.remove(creditLog);
    }

}
