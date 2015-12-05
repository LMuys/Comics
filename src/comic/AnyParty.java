package comic;

import java.util.List;

/**
 * Created by hudoassenco on 12/1/15.
 */
public abstract class AnyParty {

    protected String mName;
    protected String mUserName;
    protected String mPassword;

    public AnyParty(String name, String userName, String password) {
        this.mName = name;
        this.mUserName = userName;
        this.mPassword = password;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String userName) {
        mUserName = userName;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String password) {
        mPassword = password;
    }

    public abstract void addProperty(AnyProperty property);
    public abstract boolean removeProperty(AnyProperty property);
    public abstract List<? extends AnyProperty> getProperties();
    public abstract void setProperties(List<? extends AnyProperty> properties);

    public abstract void addIntellect(AnyIntellect intellect);
    public abstract boolean removeIntellect(AnyIntellect intellect);
    public abstract List<? extends AnyIntellect> getIntellects();
    public abstract void setIntellects(List<? extends AnyIntellect> intellects);

}
