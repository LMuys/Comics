package comic;

import java.util.List;

/**
 * Created by hudoassenco on 12/4/15.
 */
public class User extends AnyParty {

    public User(String name, String userName, String password) {
        super(name, userName, password);
    }

    @Override
    public void addProperty(AnyProperty property) {

    }

    @Override
    public boolean removeProperty(AnyProperty property) {
        return false;
    }

    @Override
    public List<? extends AnyProperty> getProperties() {
        return null;
    }

    @Override
    public void setProperties(List<? extends AnyProperty> properties) {

    }

    @Override
    public void addIntellect(AnyIntellect intellect) {

    }

    @Override
    public boolean removeIntellect(AnyIntellect intellect) {
        return false;
    }

    @Override
    public List<? extends AnyIntellect> getIntellects() {
        return null;
    }

    @Override
    public void setIntellects(List<? extends AnyIntellect> intellects) {

    }
}
