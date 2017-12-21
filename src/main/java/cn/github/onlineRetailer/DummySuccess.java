package cn.github.onlineRetailer;

import java.io.Serializable;


public class DummySuccess implements Serializable {
	
	private Boolean result = true;

	private String returnCode;
	/**
	 * @return the result
	 */
	public Boolean getResult() {
		return result;
	}

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	/**
	 * @param result
	 *            the result to set
	 */
	public void setResult(Boolean result) {
		this.result = result;
	}
}
