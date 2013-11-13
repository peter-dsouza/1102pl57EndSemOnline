import java.util.ArrayList;


public class Sprint {
	int maxSP;
	ArrayList<Story> stories;
	
	Sprint(int maxSP){
		this.maxSP=maxSP;
		stories=null;
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
		if((20 - getStoryPointSum())<story.getStoryPoints()){
			stories.add(story);
		}
		else System.out.println("Cannot fit Story: "+story.getStory()+" into this sprint...");
	}
	
	public Story getStory(int pos){
		return stories.get(pos);
	}
	
	public int getStoryPointSum(){
		int sum=0;
		for(int i=0; i<stories.size(); i++){
			sum=sum+stories.get(i).getStoryPoints();
		}
		return sum;
	}
}
