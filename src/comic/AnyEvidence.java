package comic;
public abstract class AnyEvidence {

    private static int NEXT_ID = 0;

    protected int mId;

    public AnyEvidence(int mId) {
        this.mId = mId;
    }

    public int getId() {
        return mId;
    }

    public void setId(int mId) {
        this.mId = mId;
    }

    public abstract boolean validateClaim(AnyClaim claim);

    public static int getNextId() {
        int id = NEXT_ID;
        NEXT_ID++;
        return id;
    }
}
