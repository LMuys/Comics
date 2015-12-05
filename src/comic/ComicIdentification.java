package comic;

/**
 * Created by hudoassenco on 12/4/15.
 */
public class ComicIdentification extends AnyClaim {

    //See Marvel website
    private String mUPC;

    public ComicIdentification(int mId, String UPC) {
        super(mId);
        mUPC = UPC;
    }

    public String getUPC() {
        return mUPC;
    }

    public void setUPC(String UPC) {
        mUPC = UPC;
    }
}
