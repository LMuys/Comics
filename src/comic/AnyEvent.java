package comic;

import java.util.Date;

/**
 * Created by hudoassenco on 12/4/15.
 */
public abstract class AnyEvent {

    private int mId;
    private Date mDate;

    public AnyEvent(int id, Date date) {
        mId = id;
        mDate = date;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }
}