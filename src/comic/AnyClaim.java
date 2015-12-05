package comic;

public abstract class AnyClaim {

	protected int mId;
	
	public AnyClaim(int mId) {
		this.mId = mId;
	}
	
	public int getId() {
		return mId;
	}

	public void setId(int mId) {
		this.mId = mId;
	}
}