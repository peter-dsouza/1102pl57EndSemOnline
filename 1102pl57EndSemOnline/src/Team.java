import java.util.ArrayList;


public class Team {
	String productOwner;
	String scrumMaster;
	ArrayList<String> members;
	
	Team(){
		members = new ArrayList<String>();
	}
	
	public String getProductOwner() {
		return productOwner;
	}
	public void setProductOwner(String productOwner) {
		this.productOwner = productOwner;
	}
	public String getScrumMaster() {
		return scrumMaster;
	}
	public void setScrumMaster(String scrumMaster) {
		this.scrumMaster = scrumMaster;
	}
	public ArrayList<String> getMembers() {
		return members;
	}
	public void setMembers(ArrayList<String> members) {
		this.members = members;
	}
	public void addMember(String mmbr){
		this.members.add(mmbr);
	}
	public String getMember(int pos){
		return this.members.get(pos);
	}
	
}
