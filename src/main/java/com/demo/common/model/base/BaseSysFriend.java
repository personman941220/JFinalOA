package com.pointlion.sys.mvc.admin.generator.generated.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSysFriend<M extends BaseSysFriend<M>> extends Model<M> implements IBean {

	public M setId(java.lang.String id) {
		set("id", id);
		return (M)this;
	}

	public java.lang.String getId() {
		return get("id");
	}

	public M setFriendId(java.lang.String friendId) {
		set("friend_id", friendId);
		return (M)this;
	}

	public java.lang.String getFriendId() {
		return get("friend_id");
	}

	public M setUserId(java.lang.String userId) {
		set("user_id", userId);
		return (M)this;
	}

	public java.lang.String getUserId() {
		return get("user_id");
	}

}