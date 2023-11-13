package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomobileInsurancePage {
	
	protected WebDriver driver;
	
	WebDriverWait wait = new WebDriverWait(driver, 15);
	
	public AutomobileInsurancePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	private WebElement comboMake = driver.findElement(By.id("make"));
	private WebElement engineperformance = driver.findElement(By.id("engineperformance"));
	private WebElement dateofmanufacture = driver.findElement(By.id("dateofmanufacture"));
	private WebElement comboNumberSeats = driver.findElement(By.id("numberofseats"));
	private WebElement comboFuel = driver.findElement(By.id("fuel"));
	private WebElement listprice = driver.findElement(By.id("listprice"));
	private WebElement licenseplatenumber = driver.findElement(By.id("licenseplatenumber"));
	private WebElement annualmileage = driver.findElement(By.id("annualmileage"));
	private WebElement nextenterinsurantdata = driver.findElement(By.id("nextenterinsurantdata"));
	
	private WebElement firstname = driver.findElement(By.id("firstname"));
	private WebElement lastname = driver.findElement(By.id("lastname"));
	private WebElement birthdate = driver.findElement(By.id("birthdate"));
	private WebElement gender = driver.findElement(By.xpath("//form[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span"));
	private WebElement streetaddress = driver.findElement(By.id("streetaddress"));
	private WebElement zipcode = driver.findElement(By.id("zipcode"));
	private WebElement city = driver.findElement(By.id("city"));
	private WebElement comboOccupation = driver.findElement(By.id("occupation"));
	private WebElement hobbies = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[5]/span"));
	private WebElement website = driver.findElement(By.id("website"));
	private WebElement nextenterproductdata = driver.findElement(By.id("nextenterproductdata"));
	
	private WebElement comboInsurance = driver.findElement(By.id("insurancesum"));
	private WebElement comboMerit = driver.findElement(By.id("meritrating"));
	private WebElement comboDamage = driver.findElement(By.id("damageinsurance"));
	private WebElement optionalproducts = driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span"));
	private WebElement comboCourtesyCar = driver.findElement(By.id("courtesycar"));
	private WebElement nextselectpriceoption = driver.findElement(By.id("nextselectpriceoption"));

	private WebElement selectoption = driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span"));

	private WebElement email = driver.findElement(By.id("email"));
	private WebElement phone = driver.findElement(By.id("phone"));
	private WebElement username = driver.findElement(By.id("username"));
	private WebElement password = driver.findElement(By.id("password"));
	private WebElement confirmpassword = driver.findElement(By.id("confirmpassword"));
	private WebElement Comments = driver.findElement(By.id("Comments"));

	
	public AutomobileInsurancePage abaFormulario(String aba) {
		
		

		if (aba.equals("Enter Vehicle Data")) {

			@SuppressWarnings("unused")
			WebElement pageVehicle = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("make"))));
			
			Select select = new Select(comboMake);
			select.selectByVisibleText("Volkswagen");
			
			engineperformance.sendKeys("1500");
			
			dateofmanufacture.sendKeys("11/10/2023");
			
			select = new Select(comboNumberSeats);
			select.selectByVisibleText("1");
					
			select = new Select(comboFuel);
			select.selectByVisibleText("Petrol");
			
			listprice.sendKeys("15000");

			licenseplatenumber.sendKeys("0987654321");
			
			annualmileage.sendKeys("10000");
			
			nextenterinsurantdata.click();

		}
		if (aba.equals("Enter Insurant Data")) {

			@SuppressWarnings("unused")
			WebElement pageInsurant = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("firstname"))));

			firstname.sendKeys("Rafael");

			lastname.sendKeys("Coura");

			birthdate.sendKeys("12/24/1987");

			gender.click();

			streetaddress.sendKeys("Rua Conselheiro Lafayette");

			
			Select select = new Select(comboNumberSeats);
			select.selectByVisibleText("Brazil");

			zipcode.sendKeys("09550001");

			city.sendKeys("São Caetano do Sul");

			select = new Select(comboOccupation);
			select.selectByVisibleText("Employee");

			hobbies.click();

			website.sendKeys("www.rafaelcoura.com.br");

			nextenterproductdata.click();

		}
		if (aba.equals("Enter Product Data")) {

			@SuppressWarnings("unused")
			WebElement pageProduct = wait
					.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("startdate"))));

			driver.findElement(By.id("startdate")).sendKeys("11/10/2024");

			
			Select select = new Select(comboInsurance);
			select.selectByVisibleText("5.000.000,00");

			
			select = new Select(comboMerit);
			select.selectByVisibleText("Bonus 10");

			
			select = new Select(comboDamage);
			select.selectByVisibleText("No Coverage");

			optionalproducts.click();

			
			select = new Select(comboCourtesyCar);
			select.selectByVisibleText("Yes");

			nextselectpriceoption.click();

		}
		if (aba.equals("Select Price Option")) {

			@SuppressWarnings("unused")
			WebElement pagePrice = wait
					.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("priceTable"))));

			selectoption.click();

			WebElement btnNext = wait
					.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("nextsendquote"))));
			btnNext.click();

		}
		if (aba.equals("Send Quote")) {

			@SuppressWarnings("unused")
			WebElement pageSendQuote = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email"))));

			email.sendKeys("r_coura@hotmail.com");

			phone.sendKeys("5511998737708");

			username.sendKeys("Rafael");

			password.sendKeys("Senha@123");

			confirmpassword.sendKeys("Senha@123");

			Comments.sendKeys("Cadastro Finalizado!");

		}

		return this;
	}

}
