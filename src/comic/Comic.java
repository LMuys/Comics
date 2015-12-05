package comic;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by hudoassenco on 12/1/15.
 */
public class Comic extends AnyIntellect {

	private int comicId;
    private String mName;
    private String pictureUrl;
    String mHero;
    private List<String> mCharactersNames;

    public Comic(int mId, String name, String hero) {
        super(mId);
        comicId = mId;
        mName = name;
        mHero = hero;
        mCharactersNames = new ArrayList<String>();
        mCharactersNames.add(mHero);
    }
    
    public void setPicture(String pictureUrl) {
    	this.pictureUrl = pictureUrl;
    }
    
    public String getPicture() {
    	return this.pictureUrl;
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

    @Override
    public AnyEvidence generateEvidence() {
        //TODO: How to get the AuthorName?
        return new CopyrightEvidence(AnyEvidence.getNextId(),"", mId, new Date() );
    }
    
    @Override
    public String toString() {
    	if (mCharactersNames != null && !mCharactersNames.isEmpty()) {
    		String characters = "";
    		for (String character : mCharactersNames) {
    			characters += character + ", ";
    		}
    		characters = characters.substring(0, characters.lastIndexOf(","));
    		return "Name: " + mName + ", with main characters " + characters + ".";
    	}
    	return "Name: " + mName + ", no characters listed.";
    }
}
