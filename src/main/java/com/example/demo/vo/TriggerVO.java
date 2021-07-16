package com.example.demo.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TriggerVO {
	
    /* 트리거 이름 */
    private String triggerName;
    
    /* 트리거에 연결된 작업 이름 */
    private String jobName;
    
    /* 설명 */
    private String description;
    
    /* 다음에 시작할 시간 */
    private String nextFireTime;
    
    /* 직전에 시작한 시간 */
    private String prevFireTime;
    
    /* 최초에 시작된 시간 */
    private String startTime;
    
    // 없어도 되나?
    @JsonProperty("job")
    private JobVO jobVO;

	public String getTriggerName() {
		return triggerName;
	}
	public void setTriggerName(String triggerName) {
		this.triggerName = triggerName;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNextFireTime() {
		return nextFireTime;
	}
	public void setNextFireTime(String nextFireTime) {
		this.nextFireTime = nextFireTime;
	}
	public String getPrevFireTime() {
		return prevFireTime;
	}
	public void setPrevFireTime(String prevFireTime) {
		this.prevFireTime = prevFireTime;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public JobVO getJobVO() {
		return jobVO;
	}
	public void setJobVO(JobVO jobVO) {
		this.jobVO = jobVO;
	}
    
}

