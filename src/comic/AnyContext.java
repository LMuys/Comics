package comic;

import java.util.List;

/**
 * Created by hudoassenco on 12/4/15.
 */
public abstract class AnyContext {

    protected int mId;

    public AnyContext(int id) {
        mId = id;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public abstract void addRelatedType(AnyType type);
    public abstract boolean removeRelatedType(AnyType type);
    public abstract List<? extends AnyType> getRelatedTypes();
    public abstract void setRelatedType(List<? extends AnyType> types);
}
