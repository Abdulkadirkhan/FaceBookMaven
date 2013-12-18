package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import Core.Page;

public class EditProfilePage extends Page{
	
	
	
	public void ChangePic(String path){
		
		
		click("editprofilepicture");
		
		driver.findElement(By.name("pic")).sendKeys(path);
	}
	
	public void UpdateInfo(){
		
		
		
	}
	
	
	public void AddaCover(){
		
		
		
	}

}
