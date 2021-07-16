package com.example.demo.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AgentVO {
	
    /* scheduler vo */
    @JsonProperty("scheduler")
    private SchedulerVO schedulerVO;
    
    /* trigger 정보 */
    @JsonProperty("trigger")
    private TriggerVO[] triggerVO;
    
    /* job 정보 */
    @JsonProperty("job")
    @JsonInclude(Include.NON_NULL)
    private JobVO[] jobVO;

	public SchedulerVO getSchedulerVO() {
		return schedulerVO;
	}
	public void setSchedulerVO(SchedulerVO schedulerVO) {
		this.schedulerVO = schedulerVO;
	}
	public TriggerVO[] getTriggerVO() {
		return triggerVO;
	}
	public void setTriggerVO(TriggerVO[] triggerVO) {
		this.triggerVO = triggerVO;
	}
	public JobVO[] getJobVO() {
		return jobVO;
	}
	public void setJobVO(JobVO[] jobVO) {
		this.jobVO = jobVO;
	}
}
