package scaits.util;

import java.io.Serializable;
import java.util.Date;

public class ApplicationPaymentsDTO implements Serializable {

	private float amount;
	private String Heads;
	private long Receipt;
	private Date PayDate;
	private String PayMode;
	private String PayType;

	public String getHeads() {
		return Heads;
	}

	public void setHeads(String heads) {
		Heads = heads;
	}

	public long getReceipt() {
		return Receipt;
	}

	public void setReceipt(long receipt) {
		Receipt = receipt;
	}

	public Date getPayDate() {
		return PayDate;
	}

	public void setPayDate(Date payDate) {
		PayDate = payDate;
	}

	public String getPayMode() {
		return PayMode;
	}

	public void setPayMode(String payMode) {
		PayMode = payMode;
	}

	public String getPayType() {
		return PayType;
	}

	public void setPayType(String payType) {
		PayType = payType;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

}