/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nackademin.librarytest.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author testautomatisering
 */
public class BookPage {

    @FindBy(css = "#gwt-uid-3")
    SelenideElement titleField;
    @FindBy(css = "#gwt-uid-5")
    SelenideElement authorField;
    @FindBy(css = "#gwt-uid-7")
    SelenideElement descriptionField;
    @FindBy(css = "#gwt-uid-13")
    SelenideElement numberofcopiesField;
   @FindBy(css = "#borrow-book-button")
    private SelenideElement borrowBookButton;
    @FindBy(css = "#return-book-button")
    private SelenideElement returnBookButton;
    
    
    
    public String getTitle() {
        return titleField.getText();
    }

    public String getAuthor() {
        return authorField.getText();
    }

    public String getDescription() {
        return descriptionField.getText();
    }
    
    public String getNumberofCopies() {
        return numberofcopiesField.getText();
    }
   
   public void clickBorrowBookButton() {
        borrowBookButton.click();
    } 
   public void clickReturnBookButton() {
        returnBookButton.click();
    }
}
