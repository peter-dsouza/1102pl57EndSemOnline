import java.util.ArrayList;


public class Sprint {
	int maxSP;
	ArrayList<Story> stories;
	
	Sprint(int maxSP){
		this.maxSP=maxSP;
		stories=new ArrayList<Story>();
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
		if((this.maxSP - getStoryPointSum())>=story.getStoryPoints()){
			stories.add(story);
		}
		else System.out.println("Cannot fit Story: "+story.getStory()+" into this sprint...");
	}
	
	public Story getStory(int pos){
		return stories.get(pos);
	}
	
	public int getStoryPointSum(){
		int sum=0;
		for(int i=0; i<this.stories.size(); i++){
			sum=sum+this.stories.get(i).getStoryPoints();
		}
		return sum;
	}
}
