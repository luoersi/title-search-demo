package com.caoruiqun.search.common.util;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * id生成器
 */
public class GenerateID {
    // id生成器
    private static AtomicInteger ids = new AtomicInteger(0);

    public static int setInitValue(int i) {
        ids.set(i);
        return ids.incrementAndGet();
    }
    
    public static int incrementAndGet() {
        return ids.incrementAndGet();
    }
}
