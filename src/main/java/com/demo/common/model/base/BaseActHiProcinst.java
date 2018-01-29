package com.pointlion.sys.mvc.admin.generator.generated.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseActHiProcinst<M extends BaseActHiProcinst<M>> extends Model<M> implements IBean {

	public M setId(java.lang.String id) {
		set("ID_", id);
		return (M)this;
	}

	public java.lang.String getId() {
		return get("ID_");
	}

	public M setProcInstId(java.lang.String procInstId) {
		set("PROC_INST_ID_", procInstId);
		return (M)this;
	}

	public java.lang.String getProcInstId() {
		return get("PROC_INST_ID_");
	}

	public M setBusinessKey(java.lang.String businessKey) {
		set("BUSINESS_KEY_", businessKey);
		return (M)this;
	}

	public java.lang.String getBusinessKey() {
		return get("BUSINESS_KEY_");
	}

	public M setProcDefId(java.lang.String procDefId) {
		set("PROC_DEF_ID_", procDefId);
		return (M)this;
	}

	public java.lang.String getProcDefId() {
		return get("PROC_DEF_ID_");
	}

	public M setStartTime(java.util.Date startTime) {
		set("START_TIME_", startTime);
		return (M)this;
	}

	public java.util.Date getStartTime() {
		return get("START_TIME_");
	}

	public M setEndTime(java.util.Date endTime) {
		set("END_TIME_", endTime);
		return (M)this;
	}

	public java.util.Date getEndTime() {
		return get("END_TIME_");
	}

	public M setDuration(java.lang.Long duration) {
		set("DURATION_", duration);
		return (M)this;
	}

	public java.lang.Long getDuration() {
		return get("DURATION_");
	}

	public M setStartUserId(java.lang.String startUserId) {
		set("START_USER_ID_", startUserId);
		return (M)this;
	}

	public java.lang.String getStartUserId() {
		return get("START_USER_ID_");
	}

	public M setStartActId(java.lang.String startActId) {
		set("START_ACT_ID_", startActId);
		return (M)this;
	}

	public java.lang.String getStartActId() {
		return get("START_ACT_ID_");
	}

	public M setEndActId(java.lang.String endActId) {
		set("END_ACT_ID_", endActId);
		return (M)this;
	}

	public java.lang.String getEndActId() {
		return get("END_ACT_ID_");
	}

	public M setSuperProcessInstanceId(java.lang.String superProcessInstanceId) {
		set("SUPER_PROCESS_INSTANCE_ID_", superProcessInstanceId);
		return (M)this;
	}

	public java.lang.String getSuperProcessInstanceId() {
		return get("SUPER_PROCESS_INSTANCE_ID_");
	}

	public M setDeleteReason(java.lang.String deleteReason) {
		set("DELETE_REASON_", deleteReason);
		return (M)this;
	}

	public java.lang.String getDeleteReason() {
		return get("DELETE_REASON_");
	}

	public M setTenantId(java.lang.String tenantId) {
		set("TENANT_ID_", tenantId);
		return (M)this;
	}

	public java.lang.String getTenantId() {
		return get("TENANT_ID_");
	}

	public M setName(java.lang.String name) {
		set("NAME_", name);
		return (M)this;
	}

	public java.lang.String getName() {
		return get("NAME_");
	}

}