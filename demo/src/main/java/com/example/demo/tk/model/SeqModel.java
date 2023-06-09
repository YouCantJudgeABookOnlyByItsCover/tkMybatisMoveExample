package com.example.demo.tk.model;

import java.io.Serializable;

public class SeqModel implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private Long seq;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSeq() {
        return seq;
    }

    public void setSeq(Long seq) {
        this.seq = seq;
    }
}

