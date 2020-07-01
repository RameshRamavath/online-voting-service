package com.test.votingservice.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/*@Configuration
@PropertySource("classpath:application.properties")*/

public class AppConfigs {
/*
    @Value( "${spring.datasource.url}" )
    private String jdbcUrl;

    @Value( "${spring.datasource.driver}" )
    private String jdbcDriver;

    @Value( "${spring.datasource.username}" )
    private String jdbcUserName;

    @Value( "${spring.datasource.password}" )
    private String jdbcUserPassword;


    @Bean(name = "mySqlDataSource")
    public DataSource getDataSource(){
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(jdbcDriver);
        dataSourceBuilder.url(jdbcUrl);
        dataSourceBuilder.username(jdbcUserName);
        dataSourceBuilder.password(jdbcUserPassword);
        return dataSourceBuilder.build();
    }*/

}
