
package test.core.models;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "API Key Configuration")
public @interface APIkeyConfiguration {

	@AttributeDefinition(type = AttributeType.STRING)
	 String apikey() default "ss";
	
	

}
