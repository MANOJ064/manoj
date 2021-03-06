package test.core.models;

import static org.apache.sling.api.resource.ResourceResolver.PROPERTY_RESOURCE_TYPE;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;
import org.apache.sling.models.annotations.injectorspecific.InjectionStrategy;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class)
public class Sightly {
	
	
	@Inject
	@Optional
    public String firstname;
	
	@Inject
	@Optional
	public String secondname;
	
	@Inject
	@Optional
	public Resource address;
	
	@Inject
	@Optional
	public String description;
	
	
	 public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@PostConstruct
	    protected void init() {
	      
	    }

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public Resource getAddress() {
		return address;
	}

	public void setAddress(Resource address) {
		this.address = address;
	}

	public String getSecondname() {
		return secondname;
	}

	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}

		
 

}
