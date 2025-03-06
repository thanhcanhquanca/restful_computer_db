package com.example.crud_restful.configuration;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

    public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {
        @Override
        protected Class<?>[] getRootConfigClasses() {
            return new Class[]{AppConfiguration.class};
        }

        @Override
        protected Class<?>[] getServletConfigClasses() {
            return new Class[]{};
        }

        @Override
        protected String[] getServletMappings() {
            return new String[]{"/"};   // --> Absolute path starts by "/"
        }

    }
