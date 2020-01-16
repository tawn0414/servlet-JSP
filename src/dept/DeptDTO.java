package dept;
public class DeptDTO {
	private String deptno;
	private String deptName;
	private String loc;
	private String tel;
	private String mgr;
	@Override
	public String toString() {
		return "DeptDTO [deptno=" + deptno + ", deptName=" + deptName + ", loc=" + loc + ", tel=" + tel + ", mgr=" + mgr
				+ "]";
	}
	public DeptDTO() {
		
	}
	public DeptDTO(String deptno, String deptName, String loc, String tel, String mgr) {
		super();
		this.deptno = deptno;
		this.deptName = deptName;
		this.loc = loc;
		this.tel = tel;
		this.mgr = mgr;
	}
	public String getDeptno() {
		return deptno;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMgr() {
		return mgr;
	}
	public void setMgr(String mgr) {
		this.mgr = mgr;
	}
		
	
}
