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
public class AuthorPage {
    
    
    @FindBy(css = "#gwt-uid-6")
    SelenideElement firstnameField;
    @FindBy(css = "#gwt-uid-8")
    SelenideElement lastnameField;
    @FindBy(css = "#gwt-uid-2")
    SelenideElement countryField;
    //@FindBy(css = "#side-menu-link-add-author")
    //private SelenideElement returnBookButton;
    
    public String getFirstName() {
        return firstnameField.getText();
    }

    public String getLastName() {
        return lastnameField.getText();
    }

    public String getCountry() {
        return countryField.getText();
    }
    
}
