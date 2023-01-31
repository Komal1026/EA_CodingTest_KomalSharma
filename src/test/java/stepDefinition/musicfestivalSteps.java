package stepDefinition;


import org.testng.Assert;
import Base.TestBase;
import io.cucumber.java.en.*;
import pages.MusicFestivalPage;


public class musicfestivalSteps extends TestBase {
	MusicFestivalPage musicFestivalPage;
	
		
	@Given("user is on music festival page")
	public void user_is_on_music_festival_page() {
		initialization(); 
		musicFestivalPage = new MusicFestivalPage();
	}
	
	
	@Then("user is able to validate total no of bands present on the webpage")
	public void user_is_able_to_validate_total_no_of_bands_present_on_the_webpage() {
		int bands = musicFestivalPage.validate_total_of_bands_present();
		Assert.assertEquals(bands, "18");
	}
	
	@When("user is able to see bands on the webpage")
	public void user_is_able_to_see_bands_on_the_webpage() {
		musicFestivalPage.validate_total_of_bands_present();
	}

	
	@Then("user is able to validate first bandname and record label present on the webpage")
	public void user_is_able_to_validate_first_bandname_and_record_label_present_on_the_webpage() {
		String bandAndLabel = musicFestivalPage.validate_first_bandname_and_record_label_present_on_the_webpage();
		Assert.assertEquals(bandAndLabel, "Adrian Venti Trainerella");	
	}
	
	@Then("user is able to validate the title of the webpage")
	public void user_is_able_to_validate_the_title_of_the_webpage() {
		String title = musicFestivalPage.MusicFestivalPageTitleTest();
		Assert.assertEquals(title, "EaCodingTest");	
	}

	
	@Then("user is able to validate all label names")
	public void user_is_able_to_validate_all_label_names() {
		musicFestivalPage.validate_label_names(); 
	}
	
	
	
	
	}
	
