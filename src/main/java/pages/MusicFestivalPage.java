package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Base.TestBase;

public class MusicFestivalPage extends TestBase  {

	@FindBy(xpath="//ul")
	List <WebElement> allElements;
	
	@FindBy(xpath="//ul/li")
	List <WebElement> recordLabels;
	
	@FindBy(xpath="/html/body/app-root/app-festivals/ol/li[1]")
	WebElement firstBandAndRL;
	
	//String firstBandAndRecL = firstBandAndRL.getText().toString();

	
	public MusicFestivalPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public String MusicFestivalPageTitleTest(){
		return driver.getTitle();
	}
	
	public int validate_total_of_bands_present() {
		if(allElements.size()==18)
		{
			System.out.println("Webpage loaded correctly");
		    return allElements.size();
		}
		else
			{System.out.println("Webpage is not loaded correctly");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//	    driver.navigate().refresh();
//	    System.out.println("Total no. of Bands available are:"+allElements.size());
			return allElements.size();
			}
		}
	
	public String validate_first_bandname_and_record_label_present_on_the_webpage() {
	//System.out.println("The first band and Record Label present on webpage is: " + firstBandAndRL.getText());
			return firstBandAndRL.getText();
	}
	
	public void validate_label_names() {
		  System.out.println("Record Labels present on webpage are");
		  for(WebElement i: recordLabels)
		  {
			  System.out.println(i.getText());		  
		  }   
		
	}
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
		
	
	
	

