package org.zkoss.mvvm.shadow;

public class Modal {
    private ModalType type = ModalType.INFO;
    private String message;

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
