package comic;

import java.util.Date;

/**
 * Created by hudoassenco on 12/4/15.
 */
public class Publication extends AnyIntellect {

    private Date mDate;
    private Comic mComic;

    public Publication(int mId) {
        super(mId);
    }

    @Override
    public AnyEvidence generateEvidence() {
        //Simulate Online Copyright registration

        return null;
    }

}
