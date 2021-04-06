package test.core.models;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.service.metatype.annotations.Option;


@ObjectClassDefinition(
		name = "API Configuration", 
		description = "This configuration reads the values to make an API call to use fields")
public @interface OSGIconfiguration {

	
	@AttributeDefinition(
			name = "Enable config", 
			description = "This property indicates whether the configuration values will taken into account or not", 
			type = AttributeType.BOOLEAN)
	public boolean enableConfig();

	
	@AttributeDefinition(
			name = "Protocol", 
			description = "Choose Protocol", 
			options = {
			@Option(label = "API", value = "api"), @Option(label = "APIKEYS", value = "apikeys") })
	public String getProtocol();

	
	@AttributeDefinition(
			name = "Server", 
			description = "Enter the server name")
	public String getServer();

	
	@AttributeDefinition(
			name = "Endpoint", 
			description = "Enter the endpoint")
	public String getEndpoint();
}
