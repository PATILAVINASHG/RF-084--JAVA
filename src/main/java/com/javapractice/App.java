package com.javapractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        String massage = "hello, world";
        LOG.debug(massage + "will be printed on debug");
        LOG.info(massage + "will be printed on info");
        LOG.warn(massage + "will be printed on warning");
        LOG.error(massage + "will be printed on error");
        LOG.fatal(massage + "will be printed on fatal");
        LOG.fatal(massage + "will be printed on fatal");
        LOG.info("Appenging String: {}.", massage);
    	System.out.println(massage);
    }
}
