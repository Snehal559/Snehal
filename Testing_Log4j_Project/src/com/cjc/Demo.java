package com.cjc;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;

public class Demo {
	static Logger log=Logger.getLogger(Demo.class.getName());
	public static void main(String[] args) throws IOException {
		Layout l=new SimpleLayout();
		//Layout l=new PatternLayout();
		//Layout l=new HTMLLayout();
		//Layout l=new XMLLayout();
		Appender ap=new FileAppender(l,"abc.txt");
		
		log.addAppender(ap);
		log.debug("Demo--Debug");
		log.info("Demo--Info");
		log.warn("Demo--Warn");
		log.error("Demo--Error");
		log.fatal("Demo--Fetal");
		System.out.println("This is Simple Layout");
	}
}
