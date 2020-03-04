# title-search

	简单的标题搜索,核心思想就是"内存hash ＋ ID list"。

# "内存hash ＋ ID list"概述
    其实就是“倒排索引”，不同的是索引不落地存储。索引初始化步骤为：对所有标题进行分词，以词的hash为key，doc_id的集合为value
    查询的步骤为：对查询词进行分词，对分词进行hash，直接查询hash表格，获取doc_id的list，然后多个词进行合并
    =====例子=====
    例如：
    doc1 : 我爱北京
    doc2 : 我爱到家
    doc3 : 到家美好
    先标题进行分词：
    doc1 : 我爱北京 -> 我，爱，北京
    doc2 : 我爱到家 -> 我，爱，到家
    doc3 : 到家美好 -> 到家，美好
    对分词进行hash，建立hash + ID list：
    hash(我) -> {doc1, doc2}
    hash(爱) -> {doc1, doc2}
    hash(北京) -> {doc1}
    hash(到家) -> {doc2, doc3}
    hash(美好) -> {doc3}
    这样，所有标题的初始化就完毕了，你会发现，数据量和标题的长度没有关系。
    用户输入“我爱”，分词后变为{我，爱}，对各个分词的hash进行内存检索
    hash(我)->{doc1, doc2}
    hash(爱)->{doc1, doc2}
    然后进行合并，得到最后的查找结果是doc1+doc2。
    



