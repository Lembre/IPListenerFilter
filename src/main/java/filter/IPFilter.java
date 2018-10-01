package filter;

import javax.servlet.*;
import java.io.IOException;
import java.util.Map;

/**
 * Created by Lembre on 2018.9.30
 */
public class IPFilter implements Filter {
    private FilterConfig config;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.config = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        ServletContext app = config.getServletContext();
        Map<String,Integer> map = (Map<String, Integer>) app.getAttribute("map");

        String ip = servletRequest.getRemoteAddr();

        if(map.containsKey(ip))
        {
            int cnt = map.get(ip);
            map.put("ip",cnt+1);
        }else{
            map.put(ip, 1);
        }

        app.setAttribute("map", map);
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
