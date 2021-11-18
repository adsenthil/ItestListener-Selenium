package org.adactin;

import java.util.List;

public class HomePage extends BaseClass{
public HomePage() {
PageFactory.initElements(driver, this);
}
@FindAll({@FindBy(xpath = "(//li[@class='liStation'])")})
public List<WebElement> listName;
public List<WebElement> getListName() {
	return listName;
}

@FindAll({@FindBy(xpath="(//li[@class='liStation'])")})
public List<WebElement> listName2;
public List<WebElement> getListName2() {
	return listName2;
}
}