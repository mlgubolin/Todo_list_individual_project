package toDoProject;

import java.util.Date;

public class Task {
	String title;
	Date date;
	String status;
	String project;

	public Task(String title, Date date, String status, String project) {
		super();
		this.title = title;
		this.date = date;
		this.status = status;
		this.project = project;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

}
