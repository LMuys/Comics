package comic;

import java.util.Date;

/**
 * Created by hudoassenco on 12/4/15.
 */
public class ComicLaunchEvent extends AnyEvent{

    private int mVisitors;
    private Date mEndDate;
    private String mPlace;

    public ComicLaunchEvent(int id, Date date) {
        super(id, date);
    }

    public int getVisitors() {
        return mVisitors;
    }

    public void setVisitors(int visitors) {
        mVisitors = visitors;
    }

    public Date getEndDate() {
        return mEndDate;
    }

    public void setEndDate(Date endDate) {
        mEndDate = endDate;
    }

    public String getPlace() {
        return mPlace;
    }

    public void setPlace(String place) {
        mPlace = place;
    }
}