package com.hyf.xxl.config;

import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author baB_hyf
 * @date 2022/08/02
 */
@Configuration
public class ExecutorConfiguration {

    public static final String ADMIN_ADDRESS        = "http://localhost:8283";
    public static final String APP_NAME             = "testExecutor";
    public static final String ACCESS_TOKEN_DEFAULT = "default_token";

    @Bean
    public XxlJobSpringExecutor xxlJobSpringExecutor() {
        XxlJobSpringExecutor executor = new XxlJobSpringExecutor();

        executor.setAdminAddresses(ADMIN_ADDRESS);
        executor.setAppname(APP_NAME);
        executor.setAccessToken(ACCESS_TOKEN_DEFAULT);


        return executor;
    }
}
