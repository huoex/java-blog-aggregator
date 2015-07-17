package com.oracle.miggonza.domain;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "aime$transaction_request@farm_dblink")
public class TransactionRequest {
	
	@Id
	private BigInteger treqId;
	private String treqLabelId;

	public String getTreqLabelId() {
		return treqLabelId;
	}

	public void setTreqLabelId(String treqLabelId) {
		this.treqLabelId = treqLabelId;
	}

	public BigInteger getTreqId() {
		return treqId;
	}

	public void setTreqId(BigInteger treqId) {
		this.treqId = treqId;
	}

}
