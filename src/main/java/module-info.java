module org.oelbsk.modules {

	requires spring.boot;
	requires spring.boot.autoconfigure;
	requires spring.context;
	requires spring.core;
	requires spring.beans;
	requires java.instrument;
	requires org.oelbsk.modules.service;
	requires java.annotation;
	requires java.sql;
	
	uses org.oelbsk.modules.service.IService;

	opens org.oelbsk.modules to spring.core, spring.beans, spring.context;
}