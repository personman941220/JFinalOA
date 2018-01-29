package com.pointlion.sys.mvc.admin.generator.generated.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseActIdUser<M extends BaseActIdUser<M>> extends Model<M> implements IBean {

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

	public M setFirst(java.lang.String first) {
		set("FIRST_", first);
		return (M)this;
	}

	public java.lang.String getFirst() {
		return get("FIRST_");
	}

	public M setLast(java.lang.String last) {
		set("LAST_", last);
		return (M)this;
	}

	public java.lang.String getLast() {
		return get("LAST_");
	}

	public M setEmail(java.lang.String email) {
		set("EMAIL_", email);
		return (M)this;
	}

	public java.lang.String getEmail() {
		return get("EMAIL_");
	}

	public M setPwd(java.lang.String pwd) {
		set("PWD_", pwd);
		return (M)this;
	}

	public java.lang.String getPwd() {
		return get("PWD_");
	}

	public M setPictureId(java.lang.String pictureId) {
		set("PICTURE_ID_", pictureId);
		return (M)this;
	}

	public java.lang.String getPictureId() {
		return get("PICTURE_ID_");
	}

}