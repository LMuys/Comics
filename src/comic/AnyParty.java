package comic;

import java.util.List;

/**
 * Created by hudoassenco on 12/1/15.
 */
public abstract class AnyParty {

    protected String mName;

    public AnyParty(String name) {
        this.mName = name;
    }

    public String getName() {
        return mName;
    }

    public abstract List<? extends AnyProperty> getProperties();
    public abstract List<? extends AnyIntellect> getIntellects();
}
