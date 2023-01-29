package stepDefinition;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;


public class musicfestivalSteps {
	
	WebDriver driver=null;
	
	
	@Given("browser is open")
	public void browser_is_open() {
		//System.out.println("User is inside steps-Browser is open");
	    
	    String path=System.getProperty("user.dir");
	    //System.out.println("Project path is:" + path);
	    
	   //System.getProperty("webdriver.edge.driver",path+"/src/test/resources/drivers/msedgedriver.exe");
	   System.getProperty("webdriver.chrome.driver",path+"/src/test/resources/drivers/chromedriver.exe");
	    //driver = new EdgeDriver();
	driver = new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	driver.manage().window().maximize();
	}
		
	@And("user is on music festival page")
	public void user_is_on_music_festival_page() {
	    driver.navigate().to("http://localhost:4200/festivals");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.navigate().refresh();   
	}
	
	
	@Then("user is able to extract total no of bands present on the webpage")
	public void user_is_able_to_extract_total_no_of_bands_present_on_the_webpage() {
		//System.out.println("User is inside steps-Able to see record label under every band on music festival page");
		List <WebElement> allElements = driver.findElements(By.xpath("//ul"));
	if(allElements.size()==0)
	{
		System.out.println("Webpage is not loaded correctly");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	    driver.navigate().refresh();
	    System.out.println("Total no Bands available are:"+allElements.size());
	}
	else
		System.out.println("Total no Bands available are:"+allElements.size());
	//driver.close();
	}
	
	@Then("user is able to validate all label names")
	public void user_is_able_to_validate_all_label_names() {
		List <WebElement> recordLabels = driver.findElements(By.xpath("//ul/li"));
	  System.out.println("Record Labels present on webpage are");
	  for(WebElement i: recordLabels)
	  {
		  System.out.println(i.getText());		  
	  }
	  //driver.close();	    
	}
	
	@Then("user is able to validate first bandname and record label present on the webpage")
	public void user_is_able_to_validate_first_bandname_and_record_label_present_on_the_webpage() {
		WebElement firstBandAndRL = driver.findElement(By.xpath("/html/body/app-root/app-festivals/ol/li[1]"));
		System.out.println("The first band and Record Label present on webpage is: " + firstBandAndRL.getText());
	//driver.close();
	}
	}
	
