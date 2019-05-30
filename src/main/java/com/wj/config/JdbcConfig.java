//package com.wj.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//
//import javax.sql.DataSource;
//
//@Configuration
////@PropertySource("classpath:jdbc.properties")
//@EnableConfigurationProperties(JdbcProperties.class)
//public class JdbcConfig {
//
////    @Value("${jdbc.url}")
////    private String url;
////    @Value("${jdbc.username}")
////    private String username;
////    @Value("${jdbc.password}")
////    private String password;
////    @Value("${jdbc.driverClassName}")
////    private String driverClassName;
//
//    /*@Autowired
//    private JdbcProperties jdbcProperties; //通过注入方式
//
//    public JdbcConfig(JdbcProperties jdbcProperties){
//        this.jdbcProperties = jdbcProperties;   //通过构造函数方式
//    }*/
//
//
//   /* @Bean
//    public DataSource dataSource(JdbcProperties jdbcProperties){
//        DruidDataSource dataSource = new DruidDataSource();
//       *//* dataSource.setDriverClassName("");
//        dataSource.setUrl("");
//        dataSource.setUsername("");
//        dataSource.setPassword("");*//*
//       //可以这样上面直接写，也可以使用配置文件，使用@PropertySource注解
//        *//*dataSource.setDriverClassName(driverClassName);
//        dataSource.setUrl(url);
//        dataSource.setUsername(username);
//        dataSource.setPassword(password);*//*
//        *//*使用另一种方式*//*
//        dataSource.setDriverClassName(jdbcProperties.getDriverClassName());
//        dataSource.setUrl(jdbcProperties.getUrl());
//        dataSource.setUsername(jdbcProperties.getUsername());
//        dataSource.setPassword(jdbcProperties.getPassword());
//        return dataSource;
//    }*/
//
//    @Bean
//    @ConfigurationProperties(prefix = "jdbc")  //第二种方式，需要相对应的set方法
//    public DataSource dataSource(JdbcProperties jdbcProperties){
//        return new DruidDataSource();
//    }
//}
