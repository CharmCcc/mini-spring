package com.chm.test.web.servlet;

import com.chm.test.web.handler.HandlerManager;
import com.chm.test.web.handler.MappingHandler;

import javax.servlet.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class DispatcherServlet implements Servlet {

    @Override
    public void init(ServletConfig config) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws IOException {
        for (MappingHandler mappingHandler : HandlerManager.mappingHandlerList){

            try {
                if (mappingHandler.handle(req,res)){
                    return;
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
