//package com.example.docker.demo.docker.demo.configuration;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//
//@Configuration
//@EnableTransactionManagement
//@EnableJpaRepositories(
//        entityManagerFactoryRef = "loggingMasterEntityManagerFactory",
//        transactionManagerRef = "loggingMasterEntityTransactionManager",
//        basePackages = "com.pulkit.requesttracer.datasource.repository.master"
//)
//public class LoggingMasterDbConfig {
//
//    @Bean(name = "loggingMasterDataSource")
//    @ConfigurationProperties(prefix = "master.logging.datasource")
//    public DataSource dataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "loggingMasterEntityManagerFactory")
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory(
//            EntityManagerFactoryBuilder builder, @Qualifier("loggingMasterDataSource") DataSource dataSource) {
//        return builder.dataSource(dataSource)
//                .packages("com.pulkit.requesttracer.datasource.entity")
//                .build();
//    }
//
//    @Bean(name = "loggingMasterEntityTransactionManager")
//    public PlatformTransactionManager transactionManager(@Qualifier("loggingMasterEntityManagerFactory")EntityManagerFactory entityManagerFactory) {
//        return new JpaTransactionManager(entityManagerFactory);
//    }
//}
