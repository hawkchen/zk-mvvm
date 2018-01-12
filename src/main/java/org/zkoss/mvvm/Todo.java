/* 
	Description:
		ZK Essentials
	History:
		Created by dennis

Copyright (C) 2012 Potix Corporation. All Rights Reserved.
*/
package org.zkoss.mvvm;

import java.io.Serializable;

/**
 * Todo entity 
 */
public class Todo implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;

	Integer id;
	boolean complete;
	String subject;

	public Todo() {
	}

	public Todo(Integer id, String subject) {
		this.id = id;
		this.subject = subject;
	}
	public Todo(String subject) {
		this.subject = subject;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public static Todo clone(Todo todo) {
		try {
			return (Todo) todo.clone();
		} catch (CloneNotSupportedException e) {
			// not possible
		}
		return null;
	}

}
