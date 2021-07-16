package com.example.demo.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JobVO {
	
    @JsonInclude(Include.NON_NULL)
    private String batchId;
    
    @JsonInclude(Include.NON_NULL)
    private String batchRelmNm;
    
    @JsonInclude(Include.NON_NULL)
    private String schdulNm;
    
    @JsonProperty("jobName")
    @JsonInclude(Include.NON_NULL)
    private String batchNm;
    
    @JsonProperty("jobClassName")
    @JsonInclude(Include.NON_NULL)
    private String javaClassNm;
    
    @JsonInclude(Include.NON_NULL)
    private String batchTrigrClsfNm;
    
    @JsonInclude(Include.NON_NULL)
    private String reptitInrlVal;
    
    @JsonInclude(Include.NON_NULL)
    private String cronVal;
    
    @JsonInclude(Include.NON_NULL)
    private String useYn;
    
    @JsonProperty("parameter")
    @JsonInclude(Include.NON_NULL)
    private String batchCmmt;
    
    @JsonInclude(Include.NON_NULL)
    private String instprId;
    
    @JsonInclude(Include.NON_NULL)
    private Date instDtm;
    
    @JsonInclude(Include.NON_NULL)
    private String mdfprId;
    
    @JsonInclude(Include.NON_NULL)
    private Date mdfDtm;
    
    private String inputParamtrVal;

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getBatchRelmNm() {
		return batchRelmNm;
	}

	public void setBatchRelmNm(String batchRelmNm) {
		this.batchRelmNm = batchRelmNm;
	}

	public String getSchdulNm() {
		return schdulNm;
	}

	public void setSchdulNm(String schdulNm) {
		this.schdulNm = schdulNm;
	}

	public String getBatchNm() {
		return batchNm;
	}

	public void setBatchNm(String batchNm) {
		this.batchNm = batchNm;
	}

	public String getJavaClassNm() {
		return javaClassNm;
	}

	public void setJavaClassNm(String javaClassNm) {
		this.javaClassNm = javaClassNm;
	}

	public String getBatchTrigrClsfNm() {
		return batchTrigrClsfNm;
	}

	public void setBatchTrigrClsfNm(String batchTrigrClsfNm) {
		this.batchTrigrClsfNm = batchTrigrClsfNm;
	}

	public String getReptitInrlVal() {
		return reptitInrlVal;
	}

	public void setReptitInrlVal(String reptitInrlVal) {
		this.reptitInrlVal = reptitInrlVal;
	}

	public String getCronVal() {
		return cronVal;
	}

	public void setCronVal(String cronVal) {
		this.cronVal = cronVal;
	}

	public String getUseYn() {
		return useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

	public String getBatchCmmt() {
		return batchCmmt;
	}

	public void setBatchCmmt(String batchCmmt) {
		this.batchCmmt = batchCmmt;
	}

	public String getInstprId() {
		return instprId;
	}

	public void setInstprId(String instprId) {
		this.instprId = instprId;
	}

	public Date getInstDtm() {
		return instDtm;
	}

	public void setInstDtm(Date instDtm) {
		this.instDtm = instDtm;
	}

	public String getMdfprId() {
		return mdfprId;
	}

	public void setMdfprId(String mdfprId) {
		this.mdfprId = mdfprId;
	}

	public Date getMdfDtm() {
		return mdfDtm;
	}

	public void setMdfDtm(Date mdfDtm) {
		this.mdfDtm = mdfDtm;
	}

	public String getInputParamtrVal() {
		return inputParamtrVal;
	}

	public void setInputParamtrVal(String inputParamtrVal) {
		this.inputParamtrVal = inputParamtrVal;
	}
    
}
