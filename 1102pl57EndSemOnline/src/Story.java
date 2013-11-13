import java.util.ArrayList;


public class Story {
	String story;
	int storyPoints;
	int priority;
	ArrayList<Task> tasks;
	
	Story(String name){
		this.setStory(name);
		tasks= new ArrayList<Task>();
	}
	
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public int getStoryPoints() {
		return storyPoints;
	}
	public void setStoryPoints(int storyPoints) {
		this.storyPoints = storyPoints;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public void addTask(Task task){
		tasks.add(task);
	}
	public Task getTask(int pos){
		return tasks.get(pos);
	}
	
}
