import java.util.ArrayList;


public class Project {

	String projectName;
	ArrayList<Sprint> sprints;
	Team team;
	
	Project(String name){
		this.setProjectName(name);
		sprints=new ArrayList<Sprint>();
	}
	
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public ArrayList<Sprint> getSprints() {
		return sprints;
	}
	public void setSprints(ArrayList<Sprint> sprints) {
		this.sprints = sprints;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public void addSprint(Sprint sprint){
		sprints.add(sprint);
	}
	public Sprint getSprint(int pos){
		return sprints.get(pos);
	}
	public void addTeam(Team team){
		this.setTeam(team);
	}
}
