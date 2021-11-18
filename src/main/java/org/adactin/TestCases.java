package org.adactin;

import java.util.HashSet;
import java.util.List;

@Listeners(org.adactin.ListenerTest.class)

public class TestCases extends BaseClass {

	@BeforeMethod
	private void browserLaunch() {

		browserLaunch("chrome");
		implicitWait(20);
		launcherUrl("https://www.vueling.com/en");
		findWebElement("id", "ensCloseBanner").click();
	}

	@AfterMethod
	private void browserClose() {
		// browserQuit();
	}

	@Test(priority = 0)
	private void sourceCheck() {

		WebElement sourceBox = findWebElement("xpath",
				"(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[1]");
		sourceBox.click();
		HomePage h = new HomePage();
		List<WebElement> list = h.getListName();
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
		}
		int size = list.size();
		HashSet<Object> set = new HashSet<>();
		set.addAll(list);
		int size2 = set.size();
		Assert.assertEquals(size, size2);
		System.out.println(size);
		System.out.println(size2);
	}

	@Test(priority = 1)
	private void destinationCheck() {
		findWebElement("xpath", "(//input[@placeholder='City, country or airport'])[2]").click();
		HomePage h = new HomePage();
		List<WebElement> list2 = h.getListName2();
		for (WebElement webElement : list2) {
			System.out.println(webElement.getText());
		}
		HashSet<Object> set = new HashSet<>();
		set.addAll(list2);
		int size = list2.size();
		int size2 = set.size();
		System.out.println(size);
		System.out.println(size2);
		Assert.assertEquals(size, size2);
	}

	@Test(priority = -2)
	private void sourceSelectCheck() {

		WebElement sourceBox = findWebElement("xpath",
				"(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[1]");
		sourceBox.click();
		WebElement sourceSelected = findWebElement("xpath", "//div[@id='tab-search']//li[2]");
		String Source = sourceSelected.getText();
		sourceSelected.click();
		findWebElement("xpath", "(//input[@placeholder='City, country or airport'])[2]").click();
		HomePage h = new HomePage();
		List<WebElement> list2 = h.getListName2();
		HashSet<Object> set = new HashSet<>();
		set.addAll(list2);
		boolean contains = set.contains(Source);
		System.out.println(contains);
		Assert.assertEquals(false, false);
		findWebElement("xpath", "//div[@class='searchbar-wrap']//li[41]").click();
	}

	@Test(priority=-3)
	private void dateSelectCheck() {
		WebElement sourceBox = findWebElement("xpath",
				"(//input[@class='form-control ng-untouched ng-pristine ng-valid'])[1]");
		sourceBox.click();
		WebElement sourceSelected = findWebElement("xpath", "//div[@id='tab-search']//li[2]");
		String Source = sourceSelected.getText();
		sourceSelected.click();
		findWebElement("xpath", "(//input[@placeholder='City, country or airport'])[2]").click();
		HomePage h = new HomePage();
		List<WebElement> list2 = h.getListName2();
		HashSet<Object> set = new HashSet<>();
		set.addAll(list2);
		boolean contains = set.contains(Source);
		System.out.println(contains);
		Assert.assertEquals(false, false);
		findWebElement("xpath", "//div[@class='searchbar-wrap']//li[41]").click();
	
		WebElement startDate = findWebElement("xpath",
				"(//a[@class=\"ui-state-default\"])[11]");
		startDate.click();
		
		WebElement returnDate = findWebElement("xpath",
						"(//a[@class=\"ui-state-default\"])[13]");
				returnDate.click();
				findWebElement("xpath", "//input[@class=\"form-control js-searchbar-input js-searchbar-date-input input--filled\"]").click();
				WebElement confirmStartDate = findWebElement("xpath", "//a[@class=\"ui-state-default ui-state-active\"]");
				System.out.println(confirmStartDate.getText());
				System.out.println(startDate.getText());
                Assert.assertEquals(startDate.getText(), confirmStartDate.getText());
                
	}
	
}