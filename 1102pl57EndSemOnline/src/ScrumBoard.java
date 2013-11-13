import java.util.ArrayList;


public class ScrumBoard {
	Sprint sprint;
	
	public Sprint getSprint() {
		return sprint;
	}

	public void setSprint(Sprint sprint) {
		this.sprint = sprint;
	}

	ArrayList<Task> toDo;
	ArrayList<Task> workInProgress;
	ArrayList<Task> done;
	
	ScrumBoard(Sprint sprint){
		toDo=new ArrayList<Task>();
		workInProgress=new ArrayList<Task>();
		done=new ArrayList<Task>();
		for(int i=0; i<sprint.getStories().size(); i++)
			for(int j=0; j<sprint.getStory(i).getTasks().size(); j++){
				toDo.add(sprint.getStory(i).getTask(j));
			}
	}
	
	public void getToDoTasks(){
		System.out.println("To Do:");
		for(int i=0; i<toDo.size(); i++){
			System.out.print("\n\t"+toDo.get(i).getTask());
		}
	}
	
	public void getWIPTasks(){
		System.out.println("\nWork in Progress:");
		for(int i=0; i<workInProgress.size(); i++){
			System.out.print("\n\t"+workInProgress.get(i).getTask());
		}
	}
	
	public void getDoneTasks(){
		System.out.println("Done:");
		for(int i=0; i<done.size(); i++){
			System.out.print("\n\t"+done.get(i).getTask());
		}
	}
}
