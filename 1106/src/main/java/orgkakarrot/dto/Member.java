package orgkakarrot.dto;

import java.util.ArrayList;
import java.util.List;

public class Member {
	
	private String uid, upw;
	private List<Addr> addr;
	
	@Override
	public String toString() {
		return "Member [uid=" + uid + ", upw=" + upw + ", addr=" + addr + "]";
	}
	public String getUid() {
		return uid;
	}
	public List<Addr> getAddr() {
		return addr;
	}
	public void setAddr(List<Addr> addr) {
		this.addr = addr;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUpw() {
		return upw;
	}
	public void setUpw(String upw) {
		this.upw = upw;
	}
	
	
}
