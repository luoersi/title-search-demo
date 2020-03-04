package com.caoruiqun.search.common.processor;

import com.caoruiqun.search.common.CountData;

import java.util.List;

/**
 * 处理接口
 */
public interface Processor {
    /**
     * 处理操作
     * 
     * @param countData 每个统计命中的统计文档
     * @return 返回处理结果
     */
    public String process(CountData countData);
    /**
     * 处理操作
     * 
     * @param countDatas 统计文档集合
     * @return 返回处理结果
     */
    public List<String> process(List<CountData> countDatas);
}
