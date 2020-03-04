package com.caoruiqun.search.common;

import com.caoruiqun.search.common.processor.Processor;

import java.util.ArrayList;
import java.util.List;

/**
 * 类/接口注释
 */
public class CountData implements Comparable<CountData> {
    /**
     * 敏感文本
     */
    private SensitiveText sensitiveText;

    /**
     * 统计次数
     */
    private int count;

    /**
     * 命中词
     */
    private List<SensitiveWord> words;

    /**
     * 最终结果
     */
    private String resultText;
    
    /**
     * 结果处理器
     */
    private Processor processor;

    public CountData(SensitiveText sensitiveText) {
        super();
        this.sensitiveText = sensitiveText;
        this.count = 1;
        words = new ArrayList<SensitiveWord>();
    }

    public CountData(SensitiveText sensitiveText, SensitiveWord word,Processor processor) {
        this(sensitiveText);
        words.add(word);
        this.processor = processor;
    }

    public SensitiveText getSensitiveText() {
        return sensitiveText;
    }

    public void setSensitiveText(SensitiveText sensitiveText) {
        this.sensitiveText = sensitiveText;
    }

    public String getResultText() {
        return resultText;
    }

    public void setResultText(String resultText) {
        this.resultText = resultText;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<SensitiveWord> getWords() {
        return words;
    }

    /**
     * 加入统计
     */
    public void add(SensitiveWord word) {
        this.count++;
        words.add(word);
    }

    public String result() {
        if(null == processor){
            this.resultText = sensitiveText.getText();
        }else{
            this.resultText = processor.process(this);
        }
        return resultText;
    }

    public int compareTo(CountData o) {
        if (this.count == o.getCount()) {
            return 0;
        }
        return this.count > o.getCount() ? -1 : 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CountData other = (CountData) obj;
        if (sensitiveText == null) {
            if (other.sensitiveText != null)
                return false;
        } else if (!sensitiveText.equals(other.sensitiveText))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "CountData [sensitiveText=" + sensitiveText + ", count=" + count + ", words="
                + words + "]";
    }
}