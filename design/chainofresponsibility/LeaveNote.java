package design.chainofresponsibility;

/**
 * 请假条
 * @author zzh
 * @date	2016年6月28日
 *
 */
public class LeaveNote {

	private String name;
	
	/**请假天数*/
	private int days;
	
	public LeaveNote(String name, int days) {
		super();
		this.name = name;
		this.days = days;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
	
	
}
