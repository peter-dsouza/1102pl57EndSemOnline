
public class ScrumBoard {

	public static void main(String[] args) {
		Project project=new Project("OnlineElectionSystem");
		System.out.println("New project created: "+project.getProjectName());
		
		Member sav=new Member("Saviana");
		Member nadia=new Member("Nadia");
		Member krishna=new Member("Krishna");
		Member rswagh=new Member("RSWagh");
		
		Team team=new Team();
		team.addMember(nadia);
		team.addMember(sav);
		team.setProductOwner(rswagh);
		team.setScrumMaster(krishna);
		System.out.println("\nNew team created: "+team.getMember(0).getName()+", "+team.getMember(1).getName()+", Product Owner: "+team.getProductOwner().getName()+", Scrum Master: "+team.getScrumMaster().getName());

		Task task1=new Task();
		Task task2=new Task();
		task1.setTask("UI");
		task1.setHrs(5);
		task2.setTask("DB");
		task2.setHrs(7);
		Story register=new Story("Register",12);
		register.addTask(task1);
		register.addTask(task2);
		register.setPriority(1);
		System.out.println("\nNew story created: "+register.getStory()+" => SP="+register.getStoryPoints()+" Priority="+register.getPriority());
		System.out.println("\tWith tasks:");
		System.out.println("\t\tTask: "+register.getTask(0).getTask()+" => Hrs="+register.getTask(0).getHrs());
		System.out.println("\t\tTask: "+register.getTask(1).getTask()+" => Hrs="+register.getTask(1).getHrs());

		Task task3=new Task();
		Task task4=new Task();
		task3.setTask("UI");
		task3.setHrs(5);
		task4.setTask("DB");
		task4.setHrs(7);
		Story vote=new Story("Vote",16);
		vote.addTask(task3);
		vote.addTask(task4);
		vote.setPriority(2);
		System.out.println("\nNew story created: "+vote.getStory()+" => SP="+vote.getStoryPoints()+" Priority="+vote.getPriority());
		System.out.println("\tWith tasks:");
		System.out.println("\t\tTask: "+vote.getTask(0).getTask()+" => Hrs="+vote.getTask(0).getHrs());
		System.out.println("\t\tTask: "+vote.getTask(1).getTask()+" => Hrs="+vote.getTask(1).getHrs());

		Sprint sprint1=new Sprint(20);
		sprint1.addStory(register);
		sprint1.addStory(vote);
		System.out.println("\nNew sprint created with the following stories:\n\t "+sprint1.getStory(0).getStory());
		
	}

}
