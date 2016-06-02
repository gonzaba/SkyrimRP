
public class GameLogic {

	private int count =0;
	private boolean atIntro= true;
	private boolean atFactionInfo=false;
	private boolean isReadingFaction= false;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public boolean isAtIntro() {
		return atIntro;
	}
	public void setAtIntro(boolean atIntro) {
		this.atIntro = atIntro;
	}
	public boolean isAtFactionInfo() {
		return atFactionInfo;
	}
	public void setAtFactionInfo(boolean atFactionInfo) {
		this.atFactionInfo = atFactionInfo;
	}
	public boolean isReadingFaction() {
		return isReadingFaction;
	}
	public void setReadingFaction(boolean isReadingFaction) {
		this.isReadingFaction = isReadingFaction;
	}


}
