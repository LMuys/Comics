package comic;

import java.util.Date;

/**
 * Created by hudoassenco on 12/4/15.
 */
public class CopyrightEvidence extends AnyEvidence{

    private Date mDate;
    private Comic mComic;

    public CopyrightEvidence(int mId) {
        super(mId);
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public Comic getComic() {
        return mComic;
    }

    public void setComic(Comic comic) {
        mComic = comic;
    }

    @Override
    public boolean validateClaim(AnyClaim claim) {
        final ComicIdentification comicIdentification = (ComicIdentification) claim;
        return (mComic.getClaim() == comicIdentification);
    }
}
