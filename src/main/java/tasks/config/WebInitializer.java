package tasks.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { AppConfig.class }; // тут БД, сервисы и т.д.
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { WebConfig.class }; // тут контроллеры + JSP
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" }; // перехватываем все запросы
    }
}
