import java.util.ArrayList;


public class Team {
	Member productOwner;
	Member scrumMaster;
	ArrayList<Member> members;
	
	Team(){
		members = new ArrayList<Member>();
	}
	
	public Member getProductOwner() {
		return productOwner;
	}
	public void setProductOwner(Member productOwner) {
		this.productOwner = productOwner;
	}
	public Member getScrumMaster() {
		return scrumMaster;
	}
	public void setScrumMaster(Member scrumMaster) {
		this.scrumMaster = scrumMaster;
	}
	public ArrayList<Member> getMembers() {
		return members;
	}
	public void setMembers(ArrayList<Member> members) {
		this.members = members;
	}
	public void addMember(Member mmbr){
		if(this.members.size()>4){
			this.members.add(mmbr);		
		}
		else System.out.println("Cannot add member. Team is full.");
	}
	public Member getMember(int pos){
		return this.members.get(pos);
	}
	
}
