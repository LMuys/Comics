package comic;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by hudoassenco on 12/1/15.
 */
public class Comic extends AnyProperty {

	private int comicId;
    private String mName;
    String mHero;
    private List<String> mCharactersNames;
    public List<String> mAuthors;
    private ComicIdentification mComicIdentification;
    private ComicLaunchEvent mComicLaunchEvent;
    private Genre mGenre;

    public Comic(int mId, String name, String hero) {
        super(mId);
        comicId = mId;
        mName = name;
        mHero = hero;
        mCharactersNames = new ArrayList<String>();
        mCharactersNames.add(mHero);
    }
    
    public int getComicId() {
    	return comicId;
    }
    
    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }
    
    public String getHero() {
    	return mHero;
    }
    
    public void setHero(String mHero) {
    	this.mHero = mHero;
    }

    public List<String> getCharactersNames() {
        return mCharactersNames;
    }

    public void setCharactersNames(List<String> mCharactersNames) {
        this.mCharactersNames = mCharactersNames;
    }

    public void addCharacterName(String name) {
        mCharactersNames.add(name);
    }

    public boolean removeCharacterName(String name) {
        return mCharactersNames.remove(name);
    }
    
    public void addAuthor(String author) {
        mAuthors.add(author);
    }
    public boolean removeAuthor(String author) {
        return mAuthors.remove(author);
    }
    public List<String> getAuthors() {
        return mAuthors;
    }
    public void setAuthors(List<String> authors) {
        mAuthors = authors;
    }
    public ComicLaunchEvent getComicLaunchEvent() {
        return mComicLaunchEvent;
    }
    public void setComicLaunchEvent(ComicLaunchEvent comicLaunchEvent) {
        mComicLaunchEvent = comicLaunchEvent;
    }

    public Genre getGenre() {
        return mGenre;
    }
    public void setGenre(Genre genre) {
        mGenre = genre;
    }

    @Override
    public void setClaim(AnyClaim claim) {
        mComicIdentification = (ComicIdentification) claim;
    }
    @Override
    public AnyClaim getClaim() {
        return mComicIdentification;
    }
}
