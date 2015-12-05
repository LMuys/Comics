package comic;

import java.util.Date;

/**
 * Created by hudoassenco on 12/4/15.
 */
public class Publication extends AnyIntellect {

    private Date mDate;
    private Comic mComic;
    private String mPublisher;

    public Publication(int mId) {
        super(mId);
    }

    //Remember to add the generated evidence to AnyEvidence.
    // Ex:
    // AnyEvidence evidence = publication.generateEvidence();
    // AnyEvidence.addEvidence(evidence);
    @Override
    public AnyEvidence generateEvidence() {
        //Simulate Online Copyright registration

        CopyrightEvidence evidence = new CopyrightEvidence(AnyEvidence.getNextId());
        evidence.setComic(mComic);
        evidence.setDate(new Date());

        return evidence;
    }

}
