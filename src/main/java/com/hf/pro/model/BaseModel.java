package com.hf.pro.model;

public class BaseModel {
	
	private String id;
	
	private String createData;
	
	private String delete;
	
	private String status;
	
	private String flag;

	public BaseModel(String id, String createData, String delete, String status, String flag) {
		super();
		this.id = id;
		this.createData = createData;
		this.delete = delete;
		this.status = status;
		this.flag = flag;
	}

	public BaseModel() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreateData() {
		return createData;
	}

	public void setCreateData(String createData) {
		this.createData = createData;
	}

	public String getDelete() {
		return delete;
	}

	public void setDelete(String delete) {
		this.delete = delete;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "BaseModel [id=" + id + ", createData=" + createData + ", delete=" + delete + ", status=" + status
				+ ", flag=" + flag + "]";
	}
	
	
	

}
