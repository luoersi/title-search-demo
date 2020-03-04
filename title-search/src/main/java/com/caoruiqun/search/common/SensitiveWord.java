package com.caoruiqun.search.common;

/**
 * 分解之后的词
 */
public class SensitiveWord {
    /**
     * 文档id
     */
    private Integer docId;

    /**
     * 关键词
     */
    private String word;

    /**
     * 类型，中文/英文
     */
    private String type;

    /**
     * 关键词在文档中开始下标
     */
    private Integer beginPosition;

    /**
     * 关键词在文档中结束下标
     */
    private Integer endPosition;

    public SensitiveWord(Integer docId, String word, String type, Integer beginPosition,
            Integer endPosition) {
        super();
        this.docId = docId;
        this.word = word;
        this.type = type;
        this.beginPosition = beginPosition;
        this.endPosition = endPosition;
    }

    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getBeginPosition() {
        return beginPosition;
    }

    public void setBeginPosition(Integer beginPosition) {
        this.beginPosition = beginPosition;
    }

    public Integer getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(Integer endPosition) {
        this.endPosition = endPosition;
    }



    @Override
    public String toString() {
        return "SensitiveWord [docId=" + docId + ", word=" + word + ", beginPosition="
                + beginPosition + ", endPosition=" + endPosition + "]";
    }

}
