package orgkakarrot.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class BoardDTO {
	private String title, content, writer;
	private Integer bno;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date regdate ;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Integer getBno() {
		return bno;
	}
	public void setBno(Integer bno) {
		this.bno = bno;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "BoardDTO [title=" + title + ", content=" + content + ", writer=" + writer + ", bno=" + bno
				+ ", regdate=" + regdate + "]";
	}
	
}
