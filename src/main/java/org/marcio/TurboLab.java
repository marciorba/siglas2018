package org.marcio;

import java.util.concurrent.Executor;
import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication; 
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.AsyncConfigurerSupport;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;


@SpringBootApplication
@ComponentScan(basePackages = {"org.marcio"})
@EnableJpaRepositories(basePackages = "org.marcio.repository")

public class TurboLab extends AsyncConfigurerSupport {
	public static void main(String[] args) {
		
        SpringApplication.run(TurboLab.class, args);
    }
	
    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(2);
        executor.setMaxPoolSize(2);
        executor.setQueueCapacity(500);
        executor.setThreadNamePrefix("TurboLabThread-");
        executor.initialize();
        return executor;
    }  
}