package com.sailing.hrm.common;

/*
 * �Զ�������
 * 
 */
public class SelfProperty {
	public String keyName;
	public String value;
	public String filedType;
	public String way;// �ȽϷ�ʽ =,>,<,<>

	public String getFiledType() {
		return filedType;
	}

	public void setFiledType(String filedType) {
		this.filedType = filedType;
	}

	public String getKeyName() {
		return keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getWay() {
		return way;
	}

	public void setWay(String way) {
		this.way = way;
	}
}
