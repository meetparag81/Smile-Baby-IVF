package com_milan_POM;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com_Milan_Base.TestBase;
import com_Milan_util.TestUtil;
import com_milan_POM.SurgicalHistoryPage;

public class WomenHistoryPage extends TestBase
{
	@FindBy(xpath="//main[@id='wrapper']/section/div/section/div[1]/form/div/div[1]/div/div[2]/div[1]//li[1]")WebElement MenstrualHistory;
	@FindBy(xpath= "//main[@id='wrapper']/section/div/section/div[1]/form/div/div[1]/div/div[2]/div[1]//li[2]")WebElement SexualHistory;
	@FindBy(xpath="//main[@id='wrapper']/section/div/section/div[1]/form/div/div[1]/div/div[2]/div[1]//li[3]")WebElement ObstetricHistory;
	@FindBy(xpath="//main[@id='wrapper']/section/div/section/div[1]/form/div/div[1]/div/div[2]/div[1]//li[4]")WebElement medicalHistory;
	@FindBy(xpath="//main[@id='wrapper']/section/div/section/div[1]/form/div/div[1]/div/div[2]/div[1]//li[5]")WebElement familyHistory;
	@FindBy(xpath="//main[@id='wrapper']/section/div/section/div[1]/form/div/div[1]/div/div[2]/div[1]//li[6]")WebElement SurgicalHistory;
	@FindBy(xpath="//main[@id='wrapper']/section/div/section/div[1]/form/div/div[1]/div/div[2]/div[1]//li[7]")WebElement previousTreatmentHistory;
	@FindBy(xpath="//main[@id='wrapper']/section/div/section/div[1]/form/div/div[1]/div/div[2]/div[1]//li[8]")WebElement pastMedicationHistory;
	@FindBy(xpath="//main[@id='wrapper']/section/div/section/div[1]/form/div/div[1]/div/div[2]/div[1]//li[9]")WebElement allergies;
	@FindBy(xpath="//main[@id='wrapper']/section/div/section/div[1]/form/div/div[1]/div/div[2]/div[1]//li[10]")WebElement addictions;
	@FindBy(xpath="//main[@id='wrapper']/section/div/section/div[1]/form/div/div[1]/div/div[2]/div[1]//li[11]")WebElement Vaccination;
	@FindBy(xpath="//main[@id='wrapper']/section/div/section/div[1]/form/div/div[1]/div/div[2]/div[1]//li[12]")WebElement socialHistory;
	WebDriverWait wait = new WebDriverWait(driver, 20);
	
	 
	public WomenHistoryPage()  
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	public SexualHistoryPage ClickonSexsuslHistory() throws InterruptedException
	{
		System.out.println("========sexsuslHistory click testcase started======");
		TestUtil.VisibleOn(driver, SexualHistory, 20);
		SexualHistory.click();
		System.out.println("clicked on Sexual history");
		/*List<WebElement> history = driver.findElements(By.xpath("//main[@id='wrapper']/section/div/section/div[1]/form/div/div[1]/div/div[2]/div[1]//li"));
		//System.out.println("History size is" +history.size());
		//System.out.println ("History link name is"+ history.get(1).getText());
		
		 for(int i=0;i< history.size();i++)
		 {
			// System.out.println("history names are"+ history.get(i).getText());
		 if(history.get(i).getText().contains("Sexual History"))
				 {
			 		Thread.sleep(2000);
			 		history.get(i).click();
			 		System.out.println("clicked on Sexual history");
				 }*/
		 
		 return  new SexualHistoryPage();
			 	
			 		
	}
		 public ObstetricHistoryPage ClickonObstetricHistory() throws Exception
			{
			 System.out.println("========ObstetricHistory click testcase started======");
			 TestUtil.VisibleOn(driver, ObstetricHistory, 20);
			 ObstetricHistory.click();
			 System.out.println("clicked on Obstetric History");
				/*List<WebElement> history = driver.findElements(By.xpath("//main[@id='wrapper']/section/div/section/div[1]/form/div/div[1]/div/div[2]/div[1]//li"));
				System.out.println("History size is" +history.size());
				System.out.println ("History link name is"+ history.get(1).getText());
				
				 for(int i=0;i< history.size();i++)
				 {
					// System.out.println("history names are"+ history.get(i).getText());
				 if(history.get(i).getText().contains("Obstetric History"))
						 {
					 		history.get(i).click();
					 					 	
					 		
						 }	 
		
				 }*/
				 return  new ObstetricHistoryPage();
		 
		
	
			}
		 public  MedicalHistoryPage ClickonMedicalHistory() throws Throwable
			{
			 System.out.println("========MedicalHistory click testcase started======");
			 TestUtil.VisibleOn(driver, medicalHistory, 20);
			 medicalHistory.click();
			 System.out.println("clicked on MedicalHistory");
			 
				/*List<WebElement> history = driver.findElements(By.xpath("//main[@id='wrapper']/section/div/section/div[1]/form/div/div[1]/div/div[2]/div[1]//li"));
				//System.out.println("History size is" +history.size());
				System.out.println ("History link name is"+ history.get(1).getText());
				
				 for(int i=0;i< history.size();i++)
				 {
					// System.out.println("history names are"+ history.get(i).getText());
				 if(history.get(i).getText().contains("MedicalHistory"))
						 {
					 history.get(i).click();
					 			 	
					 		
						 }	 
		
				 }*/
				return new MedicalHistoryPage() ;
				   
		 
				 
	
			}
		 
		 public FamilyHistoryPage ClicOnFamilyHistory() throws InterruptedException
			{
			 System.out.println("========FamilyHistory click testcase started======");
			 TestUtil.VisibleOn(driver, familyHistory, 20);
			 familyHistory.click();
			 System.out.println("clicked on FamilyHistory");
			 return  new FamilyHistoryPage();

			}


		public  SurgicalHistoryPage ClickOnSurgicalHistory() throws InterruptedException 
		{
			System.out.println("========SurgicalHistory click testcase started======");
			TestUtil.VisibleOn(driver, SurgicalHistory, 20);
			SurgicalHistory.click();
			System.out.println("clicked on SurgicalHistory");
			return new SurgicalHistoryPage();
		}
		public  previousTreatmentHistoryPage ClickOnpreviousTreatmentHistory() throws Exception
		{
			System.out.println("========previousTreatmentHistory click testcase started======");
			TestUtil.VisibleOn(driver, previousTreatmentHistory, 20);
			previousTreatmentHistory.click();
			System.out.println("clicked on previousTreatmentHistory");
			return new previousTreatmentHistoryPage();
			
		}
		public  WPastMedicationHistoryPage ClickOnpastMedicationHistory() throws Exception
		{
			System.out.println("========pastMedicationHistory click testcase started======");
			TestUtil.VisibleOn(driver, pastMedicationHistory, 20);
			pastMedicationHistory.click();
			System.out.println("clicked on pastMedicationHistory");
			return new WPastMedicationHistoryPage();
			
		}
		public  AllergiesPage ClickOnAllergies() throws Throwable
		{
			System.out.println("========Alleregies click testcase started======");
			TestUtil.VisibleOn(driver, allergies, 20);
			allergies.click();
			System.out.println("clicked on Allergies");
			return new AllergiesPage();
			
		}
		
		public  AddictionsPage ClickOnAddictions() throws Exception
		{
			System.out.println("========Addictions click testcase started======");
			/*List<WebElement>History= driver.findElements(By.xpath("//label[text()='Consanguinity:']//following::a"));
			for(int i=0;i<History.size();i++)
			{
				String Historyname= History.get(i).getText();
				if(Historyname.equals(" Addictions"))
				{
					History.get(i).click();
				}*/
			TestUtil.VisibleOn(driver, addictions, 30);
			addictions.click();
			System.out.println("clicked on Addictions");
			return new AddictionsPage();
				
			}
		
		public  VaccinationPage ClickOnVaccination() throws Exception
		{
			System.out.println("========Vaccination click testcase started======");
			TestUtil.VisibleOn(driver, Vaccination, 20);
			Vaccination.click();
			System.out.println("clicked on Vaccination");
			return new VaccinationPage();
			
		}
		public  socialHistoryPage ClickOnsocialHistory() throws Exception
		{
			System.out.println("========Vaccination click testcase started======");
			TestUtil.VisibleOn(driver, Vaccination, 20);
			socialHistory.click();
			System.out.println("clicked on socialHistoryPage");
			return new socialHistoryPage();
		}
		
		public  MenstrualHistoryPage ClickOnMenstrualHistory() throws Exception
		{
			System.out.println("========MenstrualHistory click testcase started======");
			TestUtil.VisibleOn(driver, MenstrualHistory, 20);
			MenstrualHistory.click();
			System.out.println("clicked on MenstrualHistoryPage");
			return new MenstrualHistoryPage();


		
		
		
		
		
		
}
}
