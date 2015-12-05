package comic;

import java.util.List;

/**
 * Created by hudoassenco on 12/1/15.
 */
public class Marvel extends AnyParty {
	protected List<AuthorContractProperty> mProperties;
    protected List<Comic> mIntellects;

    public Marvel(List<AuthorContractProperty> properties, List<Comic> intellects) {
        super("Marvel");

        this.mProperties = properties;
        this.mIntellects = intellects;
    }

    public List<? extends AnyProperty> getProperties() {
        return mProperties;
    }

    @Override
    public List<? extends AnyIntellect> getIntellects() {
        return mIntellects;
    }

    public void addProperty(AuthorContractProperty authorContractProperty) {
        mProperties.add(authorContractProperty);
    }

    public boolean removeProperty(AuthorContractProperty authorContractProperty) {
        return mProperties.remove(authorContractProperty);
    }

    public void addComic(Comic comic) {
        mIntellects.add(comic);
    }

    public boolean removeComic(Comic comic) {
        return mIntellects.remove(comic);
    }

	public String displayComics() {
		if (mIntellects == null || mIntellects.isEmpty()) return "Marvel Comics has no comics to display";
		else {
			String displayComics = "";
			for (Comic c : mIntellects) {
				displayComics += c.toString() + "\n";
			}
			return displayComics;
		}
	}

}
