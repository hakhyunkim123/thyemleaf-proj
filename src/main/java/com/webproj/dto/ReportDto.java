package com.webproj.dto;

import lombok.Data;

@Data
public class ReportDto {
	private String mCode;
	private String vCode;
	private String serverInfo;
	private long trxTcnt;
	private long trxFcnt;
	private long trxScnt;
	
	public ReportDto(String mCode, String vCode, String serverInfo, long trxTcnt, long trxFcnt, long trxScnt) {
		this.mCode = mCode;
		this.vCode = vCode;
		this.serverInfo = serverInfo;
		this.trxTcnt = trxTcnt;
		this.trxFcnt = trxFcnt;
		this.trxScnt = trxScnt;
	}
}
