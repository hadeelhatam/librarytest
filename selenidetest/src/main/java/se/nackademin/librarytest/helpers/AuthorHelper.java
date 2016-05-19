
package se.nackademin.librarytest.helpers;
import java.util.UUID;

import static com.codeborne.selenide.Selenide.page;
import se.nackademin.librarytest.model.Author;
import se.nackademin.librarytest.model.Book;
import se.nackademin.librarytest.pages.AddAuthorPage;
import se.nackademin.librarytest.pages.*;//AddUserPage;
import se.nackademin.librarytest.pages.BookPage;
import se.nackademin.librarytest.pages.BrowseAuthorsPage;
import se.nackademin.librarytest.pages.BrowseBooksPage;
import se.nackademin.librarytest.pages.MenuPage;
import se.nackademin.librarytest.pages.SignInPage;

public class AuthorHelper {
    
    public static void addNewAuthor(Author author) {

    }
                                     
    public static Author fetchAuthor(String searchQuery) {
        MenuPage menuPage = page(MenuPage.class);
        menuPage.navigateToBrowseAuthors();
        BrowseAuthorsPage browseAuthorsPage = page(BrowseAuthorsPage.class);
        browseAuthorsPage.setNameField("Hadeel!");
       // browseAuthorsPage.setLastNameField("Alhasan!");

        browseAuthorsPage.clickSearchAuthorsButton();
        browseAuthorsPage.clickFirstResultName();

        AuthorPage authorPage = page(AuthorPage.class);
        Author author = new Author();
        author.setFirstName(authorPage.getFirstName());
        author.setLastName(authorPage.getLastName());
        author.setCountry(authorPage.getCountry());
        return author;
    }

public static void createNewAuthor(String firstname, String lastname, String biographyname, String countryname) {
        MenuPage menuPage = page(MenuPage.class);
        menuPage.navigateToAddAuthor();

        AddAuthorPage addAuthorPage = page(AddAuthorPage.class);
        addAuthorPage.setFirstname(firstname);
        addAuthorPage.setLastname(lastname);
        addAuthorPage.setBiographyname(biographyname);
        addAuthorPage.setCountryname(countryname);
        addAuthorPage.clickAddAuthorButton();
            
    }
}
 /*   public static void logInAsUser(String username, String password) {
        MenuPage menuPage = page(MenuPage.class);
        menuPage.navigateToSignIn();
        SignInPage signInPage = page(SignInPage.class);
        signInPage.setUsername(username);
        signInPage.setPassword(password);
        signInPage.clickLogIn();

    }
*/
