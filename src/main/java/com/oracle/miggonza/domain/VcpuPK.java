package com.oracle.miggonza.domain;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Embeddable;

@Embeddable
public class VcpuPK implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String resName;
	private BigInteger vcpuNum;
	
	public String getResName() {
		return resName;
	}

	public void setResName(String resName) {
		this.resName = resName;
	}

	public BigInteger getVcpuNum() {
		return vcpuNum;
	}

	public void setVcpuNum(BigInteger vcpuNum) {
		this.vcpuNum = vcpuNum;
	}
	
	public int hashCode() {
        return resName.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof VcpuPK)) return false;
        VcpuPK pk = (VcpuPK) obj;
        return pk.vcpuNum == vcpuNum && pk.resName.equals(resName);
    }

}

