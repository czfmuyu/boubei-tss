/* ==================================================================   
 * Created [2007-1-8] by Jon.King 
 * ==================================================================  
 * TSS 
 * ================================================================== 
 * mailTo:boubei@163.com
 * Copyright (c) boubei.com, 2015-2018 
 * ================================================================== 
*/

package com.boubei.tss.cache.extension.workqueue;

import com.boubei.tss.cache.Reusable;

/** 
 * 可执行且可回收的任务的接口
 * 
 */
public interface Task extends Reusable {

    /**
     * 执行任务
     */
    void excute();
    
}

