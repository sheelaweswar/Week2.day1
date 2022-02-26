package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateLeadcls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver objcrmdriver = new ChromeDriver();
		objcrmdriver.get("http://leaftaps.com/opentaps/control/login");
		objcrmdriver.manage().window().maximize();
		WebElement usrnme =  objcrmdriver.findElement(By.id("username"));
		usrnme.sendKeys("demoSalesManager");
	    objcrmdriver.findElement(By.id("password")).sendKeys("crmsfa");
	    objcrmdriver.findElement(By.className("decorativeSubmit")).click();
	    objcrmdriver.findElement(By.linkText("CRM/SFA")).click();
	    objcrmdriver.findElement(By.linkText("Leads")).click();
	    objcrmdriver.findElement(By.linkText("Create Lead")).click();
	    WebElement cmpnme = objcrmdriver.findElement(By.id("createLeadForm_companyName"));
	    cmpnme.sendKeys("TestLeaf");
	    WebElement fstnme = objcrmdriver.findElement(By.id("createLeadForm_firstName"));
	    fstnme.sendKeys("Sheelaw");
	    WebElement lstnme = objcrmdriver.findElement(By.id("createLeadForm_lastName"));
	    lstnme.sendKeys("Eswaramoorthy");
	    WebElement dptnme = objcrmdriver.findElement(By.id("createLeadForm_departmentName"));
	    dptnme.sendKeys("IT");
	   	WebElement dcrptn = objcrmdriver.findElement(By.id("createLeadForm_description"));
	    dcrptn.sendKeys("Creating the test lead");
	    WebElement email = objcrmdriver.findElement(By.id("createLeadForm_primaryEmail"));
	    email.sendKeys("sheelaw@gmail.com");
	    WebElement stnme = objcrmdriver.findElement(By.name("generalStateProvinceGeoId"));
	    Select objchoosest = new Select(stnme);
	    objchoosest.selectByVisibleText("New York");
	    objcrmdriver.findElement(By.className("smallSubmit")).click();
	    String crtleadtitle = objcrmdriver.getTitle();
	    System.out.println(crtleadtitle);
	    objcrmdriver.findElement(By.linkText("Duplicate Lead")).click();
	    WebElement updcmpnme = objcrmdriver.findElement(By.id("createLeadForm_companyName"));
	    updcmpnme.clear();
	    updcmpnme.sendKeys("NewTestLeaf");
	    WebElement updfstnme = objcrmdriver.findElement(By.id("createLeadForm_firstName"));
	    updfstnme.clear();
	    updfstnme.sendKeys("Senthil");
	    objcrmdriver.findElement(By.className("smallSubmit")).click();
	    String upleadtitle1 = objcrmdriver.getTitle();
	    System.out.println(upleadtitle1);    
	    objcrmdriver.close();
	}

}
