package com.huang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

@Configuration
@EnableAsync
public class ExecutorConfig {

    public static final String THREAD_PREFIX = "thread-first-";

    @Bean
    public Executor executor(){
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(10);
        taskExecutor.setMaxPoolSize(Integer.MAX_VALUE);
        taskExecutor.setQueueCapacity(30);
        taskExecutor.setKeepAliveSeconds(60);
        taskExecutor.setThreadNamePrefix(THREAD_PREFIX);
        taskExecutor.setWaitForTasksToCompleteOnShutdown(true);
        taskExecutor.setAwaitTerminationSeconds(60);
        taskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        return taskExecutor;
    }
}
