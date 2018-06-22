package com_Milan_Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com_Milan_Base.TestBase;
import com_Milan_Excelutility.Exls_Reader;
import com_milan_POM.Loginpage;
import com_milan_POM.HomePage;
import com_milan_POM.CycleListPage;
import com_milan_POM.EMRDashBoardPage;
import com_milan_POM.WInvestigationPage;
import com_milan_POM.WOPUCycyclePage;


public class WOPUCycyclePageTest extends TestBase
{
	Loginpage Loginpage;
	HomePage HomePage;
	EMRDashBoardPage EMRPage;
	WInvestigationPage Investigation;
	WOPUCycyclePage WOC;
	 Exls_Reader reader = new Exls_Reader("C:\\Parag\\Git\\IVFmilan\\src\\main\\java\\com_Milan_TestData\\Milandata.xlsx");
	 String msg;
	WOPUCycyclePageTest()
	{
		super();
	}
	
	@BeforeMethod()
	public void Setup() 
	{
		TestBase.initalization();
		Loginpage = new Loginpage();
		HomePage = Loginpage.Verifylogin(prop.getProperty("username"), prop.getProperty("password"));
		EMRPage = HomePage.searchPaient();
		Investigation = EMRPage.ClickOnInvestigation();
		 WOC = new WOPUCycyclePage();
	}
	
	
	
	@Test(priority=1,groups = {"smoketest" },enabled=true)
	public void AleadySavedCycleTest() 
	{
		boolean flag= WOC.AlreadySavedCycle();// if there is already available cycle saved this option become true.
		if(flag==true)
		{
			String act=	WOC.AddExistionService();
			String exp = reader.getCellData("Investigation", "Fashmessage", 6);
			Assert.assertEquals(act, exp, "existingpackageadded");	
			System.out.println("AleadySavedCycleTest is completed");
		}
		else
		{
			assertFalse(flag);
			System.out.println("AleadySavedCycleTest is completed");
		}
		
	}	
	@Test(priority=2,groups = {"smoketest" },enabled=true)
	public void MessageforAlreadtyavailableCycleTest() 
	{
		boolean flag1 =WOC.AlreadySavedCycle();// if there is already available cycle saved this option become true.
		if(flag1==false)
		{
			assertFalse(flag1);
			System.out.println("MessageforAlreadtyavailableCycleTest is completed");
		}
		else
		{
			boolean flag = true;
			if(flag==true)
			{
				
				String act= WOC.MessageforAlreadtyavailableCycle();
				String exp = reader.getCellData("Investigation", "Fashmessage", 7);
				Assert.assertEquals(act, exp);
				
			}
			else
			{
				
				
			}
		}
		
		
		
	}
	@Test(priority=3,groups = {"functional" }, enabled=true)
	public void SaveOPUsubtypeICSITest() throws Exception
	{
		boolean flag1 =WOC.AlreadySavedCycle();// if there is already available cycle saved this option become true.
		if(flag1==true)
		{
			 
			String act= WOC.AddExistionService();
			String exp = reader.getCellData("Investigation", "Fashmessage", 6);
			Assert.assertEquals(act, exp);
			
		}
		else
		{
			boolean flag= WOC.Existingcycle();
			if(flag==true)
			{
			String Actual = WOC.SaveOPUsubtypeICSI();
			String Expected = reader.getCellData("Investigation","Fashmessage",5 );
			Assert.assertEquals(Actual, Expected);
			System.out.println("SelectSubTypeCycleTest is completed");
			}
			else
			{
			String Actual = WOC.SaveOPUsubtypeICSI();
			String Expected = reader.getCellData("Investigation","Fashmessage",2 );
			Assert.assertEquals(Actual, Expected);
			System.out.println("SelectSubTypeCycleTest is completed");
			}
		}
		
		
		
	
	}
	
	@Test(priority=4,groups = {"smoketest" },enabled=true)
	public void ARTCycleAvailabilityMessageBeforeSaveTest() throws Exception 
	{
		boolean flag1 =WOC.AlreadySavedCycle();// if ther is already available cycle saved this option become true.
		if(flag1==true)
		{
			String act = WOC.MessageforAlreadtyavailableCycle();
			String exp = reader.getCellData("Investigation","Fashmessage",7 );
					Assert.assertEquals(act, exp);
			System.out.println("ARTCycleAvailabilityMessageBeforeSaveTest is completed");
		}
		else
		{
			boolean flag =WOC.Existingcycle();
			if(flag)
			{
			String Actual = WOC.ARTCycleAvailabilityMessageBeforeSave();
			String Expected = reader.getCellData("Investigation","Fashmessage", 4);
			Assert.assertEquals(Actual, Expected);
			System.out.println("ARTCycleAvailabilityMessageTest completed");
			}
			else
			{
				String act = WOC.ARTCycleAvailabilityMessageBeforeSave();	
				String exp = reader.getCellData("Investigation","Fashmessage", 5);
				Assert.assertEquals(act, exp);
			}
			System.out.println("ARTCycleAvailabilityMessage is completed");
		}
		
		
	}
	
	
	@Test(priority=5,groups = {"smoketest" },enabled=true)
	public void SearchcycleTest() throws Exception
	{
		
		
		int sct= WOC.SearchThecycles();	
		int exp= 7;
	}
	
	@Test(priority=6,groups = {"functional" },enabled=true)
	public void DeleteTheSeviceBeforeSaveTest() throws Exception
	{
		boolean flag1 =WOC.AlreadySavedCycle();// if ther is already available cycle saved this option become true.
		if(flag1==true)
		{
			WOC.AddExistionService();
			boolean flag= WOC.DeleteTheservice();
			assertTrue(flag);
			System.out.println("DeleteTheSeviceBeforeSaveTest is completed");
			
		}
		else
		{
			boolean flag =WOC.Existingcycle();
			if(flag)
			{
		String Actual=	WOC.DeleteTheSeviceBeforeSave();
		String Expected = reader.getCellData("Investigation", "Fashmessage", 3);
		Assert.assertEquals(Actual, Expected);
		System.out.println("cycle is deleted sucessfully");
			}
			else
			{
				String Actual = WOC.DeleteTheSeviceBeforeSave();
				 String Expected = reader.getCellData("Investigation", "Fashmessage", 5);
				 Assert.assertEquals(Actual, Expected);
				 System.out.println("cycle is not available");
			}
		}
		
	}
	
	
	
	
	@Test(priority=7,groups = {"functional" }, enabled=true)
	public void NoofCyclesTest() throws Exception 
	{
		boolean flag1 =WOC.AlreadySavedCycle();// if ther is already available cycle saved this option become true.
		if(flag1==true)
		{
			
			msg = "Cycle is already available";
		}
		else
		{
			int Actual= WOC.NoofCycles();
			int Expected = 7;
			Assert.assertEquals(Actual, Expected);		
		}
		
		
	}
	@Test(priority=8,groups = {"smoketest" }, enabled=true)
	public void ClickonCycletabTest() throws Exception
	{
		boolean flag1 =WOC.AlreadySavedCycle();// if ther is already available cycle saved this option become true.
		if(flag1==true)
		{
			
			String Actual= WOC.ClickOnCycle();
			String Expected = reader.getCellData("Investigation", "Fashmessage", 9);
			Assert.assertEquals(Actual, Expected);
			System.out.println("ClickonCycletabTest is completed");
			
		}
		else
		{
		String Actual= WOC.ClickOnCycle();
		String Expected = reader.getCellData("Investigation", "Fashmessage", 9);
		Assert.assertEquals(Actual, Expected);
		}
	
	}
	
	
	
	
	
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
	
	
	
	
	
	

}
