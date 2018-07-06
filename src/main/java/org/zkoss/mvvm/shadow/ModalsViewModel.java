package org.zkoss.mvvm.shadow;

import org.zkoss.bind.annotation.Command;
import org.zkoss.zul.*;

public class ModalsViewModel {

    private ListModelList<Modal> modalList = new ListModelList<>();
    private ModalType type = ModalType.INFO;
    private String message = "this is a message";

    @Command
    public void add(){
        Modal m = new Modal();
        m.setType(type);
        m.setMessage(message);
        modalList.add(m);
    }

    public ListModelList<Modal> getModalList() {
        return modalList;
    }

    public ModalType getType() {
        return type;
    }

    public void setType(ModalType type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
