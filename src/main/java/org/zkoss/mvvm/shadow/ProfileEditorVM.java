package org.zkoss.mvvm.shadow;

import org.zkoss.bind.annotation.*;

public class ProfileEditorVM {

	private boolean edit = false;
	private Person person = new Person(1, "Hawk", "Chen", 23);
	
	@Command @NotifyChange("edit")
	public void toggle(){
		edit = !edit;
	}
	
	public boolean isEdit() {
		return edit;
	}
	public void setEdit(boolean edit) {
		this.edit = edit;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
}

