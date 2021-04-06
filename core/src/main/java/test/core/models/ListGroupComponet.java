package test.core.models;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = Resource.class)
public class ListGroupComponet {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());

	
	@Inject
    @Optional
    public String firstname;
    
    @Inject
    @Optional
    public String secondname;
    
    @Inject 
    @Optional
    public List<Resource> address;
    
    @Inject
    @Optional
    public String description;

	private List<ResourceList> srikanthList = new ArrayList<>();

	@PostConstruct
	protected void init() {
	                                                                                                                                                                                                                                                                        
		logger.info("In init of ListGroupComponet");
		if (address != null) {
			logger.info("inside if");
			for (Resource resource : address) {
				ResourceList address = resource.adaptTo(ResourceList.class);
				srikanthList.add(address);
				logger.info("",srikanthList);
			}
		
		}
	}

	public String getFirstname() {
		return firstname;
	}

	public List<ResourceList> getSrikanthList() {
		return srikanthList;
	}

	public void setSrikanthList(List<ResourceList> srikanthList) {
		this.srikanthList = srikanthList;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSecondname() {
		return secondname;
	}

	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}

	public List<Resource> getAddress() {
		return address;
	}

	public void setAddress(List<Resource> address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	
		


}