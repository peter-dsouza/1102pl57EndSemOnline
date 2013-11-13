import java.util.ArrayList;


public class Sprint {
	int maxSP;
	ArrayList<Story> stories;
	
	Sprint(int maxSP){
		this.maxSP=maxSP;
	}
	
	
	
	public int getMaxSP() {
		return maxSP;
	}



	public void setMaxSP(int maxSP) {
		this.maxSP = maxSP;
	}



	public ArrayList<Story> getStories() {
		return stories;
	}



	public void addStory(Story story){
		stories.add(story);
	}
	
	public Story getStory(int pos){
		return stories.get(pos);
	}
}
