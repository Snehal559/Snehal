package com.cjc;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class DemoSaveFile {
		static Logger log=Logger.getLogger(DemoSaveFile.class.getName());
		public static void main(String[] args) {
			log.debug("Demo--Debug");
			log.info("Demo--Info");
			log.warn("Demo--Warn");
			log.error("Demo--Error");
			log.fatal("Demo--Fetal");
			System.out.println("This is Log4j");
		}	
}
