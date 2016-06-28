package design.chainofresponsibility;

/**
 * 总经理
 * @author zzh
 * @date	2016年6月28日
 *
 */
public class GeneralManager extends LeaveHandler {

	@Override
	public String handleRequest(LeaveNote leaveNote) {
		int days = leaveNote.getDays();
		if (days <= 3) {
			String name = leaveNote.getName();
			String str = "已同意" + name + "的请假!";
			return str;
		} else {
			if (getSuccessor() != null) {
				return getSuccessor().handleRequest(leaveNote);
			}
			return null;
		}
	}

}
