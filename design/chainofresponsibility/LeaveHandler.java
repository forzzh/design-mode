package design.chainofresponsibility;

/**
 * 请假处理抽象类
 * @author zzh
 * @date	2016年6月28日
 *
 */
public abstract class LeaveHandler {

	/**下个职责的对象*/
	protected LeaveHandler successor = null;

	public LeaveHandler getSuccessor() {
		return successor;
	}

	public void setSuccessor(LeaveHandler successor) {
		this.successor = successor;
	}
	
	/**
	 * 处理请假
	 * @param leaveNote
	 * @return
	 */
	public abstract String handleRequest(LeaveNote leaveNote);
}
