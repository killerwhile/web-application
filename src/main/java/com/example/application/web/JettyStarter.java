package com.example.application.web;

import com.example.application.constants.ServletConstants;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ServerProperties;
import org.glassfish.jersey.servlet.ServletContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JettyStarter {

    private static final Logger logger = LoggerFactory.getLogger(JettyStarter.class);

    public static void main(String[] args) throws Exception {
        
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        Server jettyServer = new Server(10005);
        jettyServer.setHandler(context);
        ServletHolder jerseyServlet = context.addServlet(ServletContainer.class, "/*");
        jerseyServlet.setInitOrder(0);
        jerseyServlet.setInitParameter(ServerProperties.PROVIDER_PACKAGES, ServletConstants.COMPONENT_SCAN_ROOT);

        try {
            System.out.println("Starting Jetty");
            jettyServer.start();
            System.out.println("Jetty Started");
            jettyServer.join();
        } catch (Exception e) {
            System.out.println("Could not start server");
            e.printStackTrace();
        } finally {
            jettyServer.destroy();
        }
    }

}

