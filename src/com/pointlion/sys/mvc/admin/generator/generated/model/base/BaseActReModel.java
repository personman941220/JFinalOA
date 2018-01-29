package com.pointlion.sys.mvc.admin.generator.generated.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseActReModel<M extends BaseActReModel<M>> extends Model<M> implements IBean {

	public M setId(java.lang.String id) {
		set("ID_", id);
		return (M)this;
	}

	public java.lang.String getId() {
		return get("ID_");
	}

	public M setRev(java.lang.Integer rev) {
		set("REV_", rev);
		return (M)this;
	}

	public java.lang.Integer getRev() {
		return get("REV_");
	}

	public M setName(java.lang.String name) {
		set("NAME_", name);
		return (M)this;
	}

	public java.lang.String getName() {
		return get("NAME_");
	}

	public M setKey(java.lang.String key) {
		set("KEY_", key);
		return (M)this;
	}

	public java.lang.String getKey() {
		return get("KEY_");
	}

	public M setCategory(java.lang.String category) {
		set("CATEGORY_", category);
		return (M)this;
	}

	public java.lang.String getCategory() {
		return get("CATEGORY_");
	}

	public M setCreateTime(java.util.Date createTime) {
		set("CREATE_TIME_", createTime);
		return (M)this;
	}

	public java.util.Date getCreateTime() {
		return get("CREATE_TIME_");
	}

	public M setLastUpdateTime(java.util.Date lastUpdateTime) {
		set("LAST_UPDATE_TIME_", lastUpdateTime);
		return (M)this;
	}

	public java.util.Date getLastUpdateTime() {
		return get("LAST_UPDATE_TIME_");
	}

	public M setVersion(java.lang.Integer version) {
		set("VERSION_", version);
		return (M)this;
	}

	public java.lang.Integer getVersion() {
		return get("VERSION_");
	}

	public M setMetaInfo(java.lang.String metaInfo) {
		set("META_INFO_", metaInfo);
		return (M)this;
	}

	public java.lang.String getMetaInfo() {
		return get("META_INFO_");
	}

	public M setDeploymentId(java.lang.String deploymentId) {
		set("DEPLOYMENT_ID_", deploymentId);
		return (M)this;
	}

	public java.lang.String getDeploymentId() {
		return get("DEPLOYMENT_ID_");
	}

	public M setEditorSourceValueId(java.lang.String editorSourceValueId) {
		set("EDITOR_SOURCE_VALUE_ID_", editorSourceValueId);
		return (M)this;
	}

	public java.lang.String getEditorSourceValueId() {
		return get("EDITOR_SOURCE_VALUE_ID_");
	}

	public M setEditorSourceExtraValueId(java.lang.String editorSourceExtraValueId) {
		set("EDITOR_SOURCE_EXTRA_VALUE_ID_", editorSourceExtraValueId);
		return (M)this;
	}

	public java.lang.String getEditorSourceExtraValueId() {
		return get("EDITOR_SOURCE_EXTRA_VALUE_ID_");
	}

	public M setTenantId(java.lang.String tenantId) {
		set("TENANT_ID_", tenantId);
		return (M)this;
	}

	public java.lang.String getTenantId() {
		return get("TENANT_ID_");
	}

}