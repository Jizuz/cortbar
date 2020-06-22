package com.jizuz.cortbar.model;

import java.io.Serializable;

public class TsUserVO implements Serializable {

    private static final long serialVersionUID = 6103499432513928716L;

    private Long id;

    private Long uId;

    private String uName;

    private String comment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getuId() {
        return uId;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
