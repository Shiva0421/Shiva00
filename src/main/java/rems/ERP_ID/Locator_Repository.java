package rems.ERP_ID;

import org.openqa.selenium.By;

public class Locator_Repository 
{
        
	//WebDriver driver;
        
    public static By locatorvalue(String loctype, String locval) {
    	
    	By loc = null;
    	switch(loctype) {
    		case "name":
    			loc=By.name(locval);
    			break;
    		case "id":
    			loc=By.id(locval);
    			break;
    		case "xpath":
    			loc=By.xpath(locval);
    			break;
    		case "linktext":
    			loc=By.linkText(locval);
    			break;
    		case "partialLinkText":
    			loc=By.partialLinkText(locval);
    			break;
    		case "cssselector":
    			loc=By.cssSelector(locval);
    			break;
    		case "className":
    			loc=By.className(locval);
    			break;
    		default:
    			loc=null;
    			break;
    	}
		return loc;
	    //Hello
        	
        }
        
        
}
