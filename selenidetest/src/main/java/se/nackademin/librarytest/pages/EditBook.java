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
public class EditBook {
    @FindBy(css = "#edit-book-button")
    SelenideElement editdateField;
    @FindBy(css = "#gwt-uid-7")
    SelenideElement datepublishedField;
    @FindBy(css = "#save-book-button")
    private SelenideElement saveBookButton;
    
    

   public void TryckEditField() {
        editdateField.click();
    }
    public String getdatepublishedField() {
        return datepublishedField.getText();
    }

    public void clickSaveBookButton() {
        saveBookButton.click();
}

}