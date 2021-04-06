package test.core.models;

import java.util.Iterator;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;
import org.apache.sling.models.annotations.Source;

import com.day.cq.wcm.api.Page;

@Model(adaptables = SlingHttpServletRequest.class)
public class Childpath {
	@Inject
	@Source("childpath")
	private ResourceResolver resourceResolver;
	private List<ListPageDetails> =new ArrayList<ListPageDetails>();
	@PostConstruct
	public void init() {
		try {
			Resource resource = resourceResolver.getResource("/content/practiceApps/en");
			if(resource!=null)
			{
		Page parentPage = resource.adaptTo(Page.class);
		if(parentPage!=null){
			{
				Iterator<Page> listChildPages = parentPage.listChilderen();
				while (listChildPages.hasNext()) {
					Page childzpage = listChildPages.next();
					ListPageDetail detail =new ListPageDetail();
					details.setTitle(Child.getTitle();)
					details.setDescription(childPage.getDescription());
				}
				}
			}
		}
	catch (Exception e) { e.printStackTrace();
	}
	
	
	}
	}
		
	
	
	

}
