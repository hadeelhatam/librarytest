package se.nackademin.librarytest;

//import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
//import static java.awt.AWTEventMulticaster.add;

import java.util.UUID;

import org.junit.Test;

import static org.junit.Assert.*;

//import org.junit.Ignore;
import se.nackademin.librarytest.helpers.BookHelper;
import se.nackademin.librarytest.helpers.Table;
import se.nackademin.librarytest.helpers.UserHelper;
import se.nackademin.librarytest.helpers.AuthorHelper;

//import se.nackademin.librarytest.model.Author;
import se.nackademin.librarytest.model.Book;
import se.nackademin.librarytest.pages.BookPage;
import se.nackademin.librarytest.pages.BrowseBooksPage;
import se.nackademin.librarytest.pages.EditBook;
import se.nackademin.librarytest.pages.MenuPage;
import se.nackademin.librarytest.pages.MyProfilePage;
import se.nackademin.librarytest.pages.AddAuthorPage;
import se.nackademin.librarytest.pages.BrowseAuthorsPage;
import se.nackademin.librarytest.pages.ConfirmDialog;

public class SelenideTest extends TestBase {

    public SelenideTest() {
    }
    
    /*@Test
    public void testÄndraPubDate(){
        open("http://localhost:8080/librarytest");
        MenuPage menuPage = page(MenuPage.class);
        String uuid = (UUID.randomUUID().toString()).substring(0, 10);
        EditBook editBook = page(EditBook.class);
        BrowseBooksPage browseBooksPage = page(BrowseBooksPage.class);
                
        UserHelper.createNewUser("admin", "1234567890", uuid+"@example.com");
        UserHelper.logInAsUser("admin", "1234567890");
     
        menuPage.navigateToBrowseBooks();
        Book book = BookHelper.fetchBook("Good Omens");
        browseBooksPage.clickSearchBooksButton();
        browseBooksPage.clickFirstResultTitle();
        
     //   Book book = BookHelper.fetchBook("Good Omens");
        editBook.TryckEditField();
        editBook.getdatepublishedField();
        editBook.clickSaveBookButton();
        
        menuPage.navigateToBrowseBooks();
        BookHelper.fetchBook("Good Omens");
        browseBooksPage.clickSearchBooksButton();
        
        assertEquals("Publisged date should be ", editBook.getdatepublishedField());
    }
    
    @Test
    public void testÄndraEmail(){
       // String uuid = UUID.randomUUID().toString();
        String uuid = (UUID.randomUUID().toString()).substring(0, 10);

        open("http://localhost:8080/librarytest");
        MenuPage menuPage = page(MenuPage.class);
        MyProfilePage myProfilePage = page(MyProfilePage.class);
        
        UserHelper.createNewUser(uuid, uuid, uuid+"@example.com");
        UserHelper.logInAsUser(uuid, uuid);
        
        menuPage.navigateToMyProfile();
        myProfilePage.clickEditUserButton();
        myProfilePage.getUserEmail(uuid+"@example.com");
       
        menuPage.navigateToMyProfile();
        myProfilePage.getUserEmail(uuid);
        assertEquals("user Email should be show in profile", uuid, myProfilePage.getUserEmail(uuid));
    
    }

       
    private Integer convertToInteger(String input) {
        Integer output = null;
        try {
            output = Integer.valueOf(input);
        } catch (NumberFormatException numberFormatException) {
            //if an exception is caught we'll return null
        }
        return output;
    }
    
    @Test
    public void testLånaBok(){
        open("http://localhost:8080/librarytest");
        BrowseBooksPage browseBooksPage = page(BrowseBooksPage.class);
        
        ConfirmDialog confirmDialog = page(ConfirmDialog.class);
        MenuPage menuPage = page(MenuPage.class);
        BookPage bookPage = page(BookPage.class); 
        String uuid = (UUID.randomUUID().toString()).substring(0, 10);
        
        UserHelper.createNewUser(uuid, uuid, uuid+"@example.com"); 
        UserHelper.logInAsUser(uuid, uuid);
        
        menuPage.navigateToBrowseBooks();
        
        browseBooksPage.clickSearchBooksButton();
        browseBooksPage.clickFirstResultTitle();
        String numberBooksAvailable = bookPage.getNumberofCopies();
        String borrowBooksName = bookPage.getTitle();
        Integer i = convertToInteger(numberBooksAvailable);
        bookPage.clickBorrowBookButton();
        confirmDialog.clickYesButton();
        sleep(2000);
        i--;
        String s1=i.toString();
        assertEquals("number av bok är "+s1, s1, bookPage.getNumberofCopies());
        menuPage.navigateToMyProfile();
        Table table =new Table($(".v-grid-tablewrapper"));
        table.searchAndClick(borrowBooksName, 0);
        
        bookPage.clickReturnBookButton();
        confirmDialog.clickYesButton();
        sleep(2000);
        assertEquals("number av bok är " +numberBooksAvailable, numberBooksAvailable, bookPage.getNumberofCopies());
    }

    
    @Test
    public void testAddAuthor(){
        String uuid = (UUID.randomUUID().toString()).substring(0, 10);
        open("http://localhost:8080/librarytest");
        MenuPage menuPage = page(MenuPage.class);
        AddAuthorPage addAuthorPage = page(AddAuthorPage.class);
        BrowseAuthorsPage browseAuthorsPage = page(BrowseAuthorsPage.class);        
       
        UserHelper.createNewUser("admin", "123456789", uuid+"@example.com"); 
        UserHelper.logInAsUser("admin", "1234567890");
        
        AuthorHelper.createNewAuthor(uuid, uuid, uuid, uuid);
       
        browseAuthorsPage.setNameField(uuid);
        browseAuthorsPage.clickSearchAuthorsButton();        
                
        assertEquals("author name should be Hadeel"+browseAuthorsPage.getNameField(), browseAuthorsPage.getResultNameField());
    }
    
     
    @Test
    //@Ignore
    public void testFatchBook(){
        open("http://localhost:8080/librarytest");
        Book book = BookHelper.fetchBook("Guards!");
        assertEquals("book title should be 'Guards! Guards!', Guards! Guards!", book.getTitle());
    }*/
    
    @Test
   // @Ignore
    public void testLogin(){
       String uuid = (UUID.randomUUID().toString()).substring(0, 10);
       open("http://localhost:8080/librarytest");
        MenuPage menuPage = page(MenuPage.class);
        
        UserHelper.createNewUser(uuid, uuid, uuid+"@example.com");
        UserHelper.logInAsUser(uuid, uuid);
        
        menuPage.navigateToMyProfile();
        MyProfilePage myProfilePage = page(MyProfilePage.class);
        assertEquals("user name should be show in profile", uuid, myProfilePage.getUserName());
    }
    
   /* @Test
   // @Ignore
    public void testUsingTable() {
        page(MenuPage.class).navigateToBrowseBooks();
        BrowseBooksPage browseBooksPage = page(BrowseBooksPage.class);
        browseBooksPage.clickSearchBooksButton();
        Table table = new Table($(".v-grid-tablewrapper"));
        System.out.println(table.getColumnCount());
        System.out.println(table.getRowCount());
        System.out.println(table.getCellValue(0, 0));
        System.out.println(table.getCellValue(1, 1));
        table.searchAndClick("American Gods", 0);
        sleep(2000);
    }*/
}