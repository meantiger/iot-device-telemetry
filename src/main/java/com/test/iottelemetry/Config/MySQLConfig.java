package com.test.iottelemetry.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(
//        entityManagerFactoryRef = "customerEntityManagerFactory",
//        transactionManagerRef = "customerTransactionManager",
        basePackages = "com.test.iottelemetry.User")
@EnableTransactionManagement
public class MySQLConfig {

//    @Autowired
//    private Environment env;

//    @Primary
//    @Bean
//    PlatformTransactionManager customerTransactionManager( ){
//        JpaTransactionManager transactionManager
//                = new JpaTransactionManager();
//        transactionManager.setEntityManagerFactory(
//                customerEntityManagerFactory().getObject());
//        return transactionManager;
//    }

//    @Primary
//    @Bean
//    LocalContainerEntityManagerFactoryBean customerEntityManagerFactory( ) {
//
//
//        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
//        jpaVendorAdapter.setGenerateDdl(true);
//
//        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
//        factoryBean.setDataSource(customerDataSource());
//        factoryBean.setJpaVendorAdapter(jpaVendorAdapter);
//        factoryBean.setPackagesToScan(new String[] { "com.test.iottelemetry.User" });
//
//        return factoryBean;
//    }
//
//    @Primary
//    @Bean
//    DataSource customerDataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
//        dataSource.setUrl(env.getProperty("spring.datasource.url"));
//        dataSource.setUsername(env.getProperty("spring.datasource.username"));
//        dataSource.setPassword(env.getProperty("spring.datasource.password"));
//        return dataSource;
//    }

}
