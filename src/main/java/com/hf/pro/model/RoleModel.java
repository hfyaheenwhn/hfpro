package com.hf.pro.model;

public class RoleModel extends BaseModel {
		
	private String createUserId ;
		
	private String createUserName ;
	
	private String createUserCode ;
	
	private String modifiedUserId ;
	
	private String modifiedUserName ;
	
	private String modifiedUserCode ;
	
	private String deleteUserId ;
	
	private String deleteUserName ;
	
	private String deleteUserCode ;
	
	private String createUnitId ;
	
	private String createUnitName ;
	
	private String createUnitCode ;

	public RoleModel() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public RoleModel(String id, String createData, String delete, String status, String flag, String createUserId,
			String createUserName, String createUserCode, String modifiedUserId, String modifiedUserName,
			String modifiedUserCode, String deleteUserId, String deleteUserName, String deleteUserCode,
			String createUnitId, String createUnitName, String createUnitCode) {
		super(id, createData, delete, status, flag);
		this.createUserId = createUserId;
		this.createUserName = createUserName;
		this.createUserCode = createUserCode;
		this.modifiedUserId = modifiedUserId;
		this.modifiedUserName = modifiedUserName;
		this.modifiedUserCode = modifiedUserCode;
		this.deleteUserId = deleteUserId;
		this.deleteUserName = deleteUserName;
		this.deleteUserCode = deleteUserCode;
		this.createUnitId = createUnitId;
		this.createUnitName = createUnitName;
		this.createUnitCode = createUnitCode;
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public String getCreateUserName() {
		return createUserName;
	}

	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}

	public String getCreateUserCode() {
		return createUserCode;
	}

	public void setCreateUserCode(String createUserCode) {
		this.createUserCode = createUserCode;
	}

	public String getModifiedUserId() {
		return modifiedUserId;
	}

	public void setModifiedUserId(String modifiedUserId) {
		this.modifiedUserId = modifiedUserId;
	}

	public String getModifiedUserName() {
		return modifiedUserName;
	}

	public void setModifiedUserName(String modifiedUserName) {
		this.modifiedUserName = modifiedUserName;
	}

	public String getModifiedUserCode() {
		return modifiedUserCode;
	}

	public void setModifiedUserCode(String modifiedUserCode) {
		this.modifiedUserCode = modifiedUserCode;
	}

	public String getDeleteUserId() {
		return deleteUserId;
	}

	public void setDeleteUserId(String deleteUserId) {
		this.deleteUserId = deleteUserId;
	}

	public String getDeleteUserName() {
		return deleteUserName;
	}

	public void setDeleteUserName(String deleteUserName) {
		this.deleteUserName = deleteUserName;
	}

	public String getDeleteUserCode() {
		return deleteUserCode;
	}

	public void setDeleteUserCode(String deleteUserCode) {
		this.deleteUserCode = deleteUserCode;
	}

	public String getCreateUnitId() {
		return createUnitId;
	}

	public void setCreateUnitId(String createUnitId) {
		this.createUnitId = createUnitId;
	}

	public String getCreateUnitName() {
		return createUnitName;
	}

	public void setCreateUnitName(String createUnitName) {
		this.createUnitName = createUnitName;
	}

	public String getCreateUnitCode() {
		return createUnitCode;
	}

	public void setCreateUnitCode(String createUnitCode) {
		this.createUnitCode = createUnitCode;
	}

	
	
	
	
}
