/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin.librarytest.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author alhasan
 */
public class BrowseAuthorsPage {
  //  private String nameAuthor;
    
    @FindBy(css = "#gwt-uid-2")
    SelenideElement nameAuthor;
    @FindBy(css = "#gwt-uid-3")
    SelenideElement resultName;

    
    @FindBy(css = "#gwt-uid-2")
    private SelenideElement nameField;
    @FindBy(css = "#search-authors-button")
    private SelenideElement searchAuthorsButton;
    @FindBy(css = "#gwt-uid-3")
    private SelenideElement firstResultName;

    public void clickFirstResultName() {
        firstResultName.click();
    }
public String getResultNameField() {
        return resultName.getText();
    }
    public void setNameField(String name) {
        nameField.clear();
        nameField.sendKeys(name);
    }
    
    public String getNameField() {
        return nameAuthor.getText();
    }


    public void clickSearchAuthorsButton() {
        searchAuthorsButton.click();
    }
}
    
    

