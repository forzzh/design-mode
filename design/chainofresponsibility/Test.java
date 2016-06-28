package design.chainofresponsibility;

public class Test {

	public static void main(String[] args) {
		ProjectManager projectManager = new ProjectManager();
		GeneralManager generalManager = new GeneralManager();
		projectManager.setSuccessor(generalManager);
		
		LeaveNote leaveNote = new LeaveNote("zhangsan", 2);
		LeaveNote leaveNote2 = new LeaveNote("wangwu", 7);
		
		String handleRequest = projectManager.handleRequest(leaveNote);
		System.out.println(handleRequest);
		
		String handleRequest2 = projectManager.handleRequest(leaveNote2);
		System.out.println(handleRequest2);
		
	}
}
