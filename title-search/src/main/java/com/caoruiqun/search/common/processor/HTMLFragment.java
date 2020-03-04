package com.caoruiqun.search.common.processor;


/**
 * 高亮的方式。
 */
public class HTMLFragment extends AbstractFragment {
    /**
     * 开口标记
     */
    private String open;

    /**
     * 封闭标记
     */
    private String close;

    /**
     * 初始化开闭标签
     * 
     * @param open 开始标签，如< b >、< font >等。
     * @param close 结束标签，如< /b >、< /font >等。
     */
    public HTMLFragment(String open, String close) {
        this.open = open;
        this.close = close;
    }

    @Override
    public String format(String word) {
        return open + word + close;
    }
}
