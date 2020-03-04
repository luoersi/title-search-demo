package com.caoruiqun.search.common;

import com.caoruiqun.search.common.util.GenerateID;

import java.util.Objects;

/**
 * 敏感词文本
 */
public class SensitiveText {
    /**
     * id
     */
    private Integer id;

    /**
     * type
     */
    private Integer type;

    /**
     * 敏感词
     */
    private String text;

    public SensitiveText(String text) {
        this(GenerateID.incrementAndGet(), text);
    }

    public SensitiveText(Integer id, String text) {
        this(id, 0, text);
    }

    public SensitiveText(Integer id, Integer type, String text) {
        super();
        this.id = id;
        this.type = type;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SensitiveText that = (SensitiveText) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(type, that.type) &&
                Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, text);
    }

    @Override
    public String toString() {
        return text;
    }
    /*
     * public String toString() { return "SensitiveText [id=" + id + ", text=" + text + "]"; }
     */
}
