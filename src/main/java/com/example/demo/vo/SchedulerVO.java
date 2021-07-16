package com.example.demo.vo;

public class SchedulerVO {
	
    /* scheduler 이름 */
    private String name;
    
    /* scheduler 시작 여부 */
    private boolean isStarted;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isStarted() {
		return isStarted;
	}
	public void setStarted(boolean isStarted) {
		this.isStarted = isStarted;
	}
}
