package com.hyf.xxl.config;

import com.xxl.job.core.handler.IJobHandler;

/**
 * XxlJobSimpleExecutor手动注入
 * @author baB_hyf
 * @date 2022/08/02
 */
// @Component("glueJob")
public class GlueJob extends IJobHandler {

    @Override
    public void init() throws Exception {
        System.out.println("init");
    }

    @Override
    public void execute() throws Exception {
        System.out.println("execute");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }
}
