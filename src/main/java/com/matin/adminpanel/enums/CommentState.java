package com.matin.adminpanel.enums;

public enum CommentState {
    UNACCEPTED("UNACCEPTED"),
    ACCEPTED("ACCEPTED"),
    REJECTED("REJECTED");

    private final String state;

    CommentState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
