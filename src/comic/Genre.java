package comic;

/**
 * Created by hudoassenco on 12/4/15.
 */
public class Genre extends AnyType {

    private String mName;

    public Genre(int id, String name) {
        super(id);
        mName = name;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }
}
