module restroSecurity {
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.core;
    requires spring.beans;
    requires spring.web;
    requires spring.security.config;
    requires spring.security.web;
    requires spring.security.core;
    requires spring.security.crypto;
    requires spring.data.jpa;
    requires spring.orm;
    requires spring.jdbc;
    requires spring.webmvc;

    requires thymeleaf;
    requires thymeleaf.spring6;
    requires thymeleaf.extras.springsecurity6;

    requires jakarta.persistence;

    requires org.hibernate.orm.core;

    requires java.sql;

    requires org.apache.tomcat.embed.core;

    opens com.swayambhu.restrosecurity;
    opens com.swayambhu.restrosecurity.config.security;
    opens com.swayambhu.restrosecurity.controllers;
    opens com.swayambhu.restrosecurity.services.impls;
    opens com.swayambhu.restrosecurity.entities;
    opens com.swayambhu.restrosecurity.repositories;
    opens com.swayambhu.restrosecurity.config.mvc;
    opens com.swayambhu.restrosecurity.converters;
//    opens com.swayambhu.restrosecurity to spring.context, spring.core, spring.beans;
//    opens com.swayambhu.restrosecurity.config.security to spring.beans, spring.context, spring.core;
//    opens com.swayambhu.restrosecurity.entities to spring.beans, spring.context, spring.core, spring.orm, org.hibernate.orm.core, jakarta.persistence;
}