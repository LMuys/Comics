package comic;

import java.util.List;

public abstract class AnyEvidence {

    private static int NEXT_ID = 0;

    private static List<AnyEvidence> mEvidences;

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

    public static List<AnyEvidence> getEvidences() {
        return mEvidences;
    }

    public static void setEvidences(List<AnyEvidence> evidences) {
        mEvidences = evidences;
    }

    public static void addEvidence(AnyEvidence evidence) {
        mEvidences.add(evidence);
    }

    public static boolean removeEvidence(AnyEvidence evidence) {
        return mEvidences.remove(evidence);
    }

    public abstract boolean validateClaim(AnyClaim claim);

    public static int getNextId() {
        int id = NEXT_ID;
        NEXT_ID++;
        return id;
    }
}
