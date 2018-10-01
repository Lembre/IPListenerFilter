package lister;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Lembre on 2018.9.30
 */
public class IPListener implements ServletContextListener {

    public IPListener(){

    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Map<String ,Integer> map = new LinkedHashMap<>();
        ServletContext servletContext = sce.getServletContext();

        servletContext.setAttribute("map", map);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
