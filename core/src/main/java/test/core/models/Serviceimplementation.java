package test.core.models;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;

	
	@Component(service = Serviceimplementation.class, immediate = true)
	@Designate(ocd = APIkeyConfiguration.class, factory=true)

	public class Serviceimplementation {
		private String APIKeyConfiguration;
		
		
		APIkeyConfiguration aPIkeyConfiguration;
		

		
		
		
		@Activate
		public void activate (final APIkeyConfiguration aPIkeyConfiguration) {
			setAPIKeyConfiguration(aPIkeyConfiguration.apikey());
			
		}





		public String getAPIKeyConfiguration() {
			return APIKeyConfiguration;
		}





		public void setAPIKeyConfiguration(String aPIKeyConfiguration) {
			APIKeyConfiguration = aPIKeyConfiguration;
		}
		
		
		
		
	}