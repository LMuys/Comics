package comic;

import java.util.List;

/**
 * Created by hudoassenco on 12/4/15.
 */
public class ComicContext extends AnyContext {

    private String mDescription;
    private List<Genre> mGenres;

    public ComicContext(int id, String description) {
        super(id);
        mDescription = description;
    }

    @Override
    public void addRelatedType(AnyType type) {
        mGenres.add((Genre) type);
    }

    @Override
    public boolean removeRelatedType(AnyType type) {
        return mGenres.remove((Genre) type);
    }

    @Override
    public List<? extends AnyType> getRelatedTypes() {
        return mGenres;
    }

    @Override
    public void setRelatedType(List<? extends AnyType> types) {
        mGenres = (List<Genre>) types;
    }
}