package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Page Object Model (POM) pour la page T-Shirts.
 * Elle hérite de la classe {@link BasePage}.
 */
public class TShirtsPage extends BasePage{

    /**
     * Localisateur XPath pour le titre de la page T-Shirts.
     * Trouve l'élément span avec classe 'cat-name' dont le texte commence par 'T-shirts'
     */
    @FindBy(xpath = "//span[@class='cat-name' and starts-with(normalize-space(), 'T-shirts')]")
    WebElement tShirtTitle;

    /**
     * Constructeur de la classe {@link BasePage} que la classe TShirtsPage hérite.
     * @param webDriver Le WebDriver utilisé pour naviguer et interagir avec la page
     */
    public TShirtsPage(WebDriver webDriver) {
        super(webDriver);
    }

    /**
     * Vérifie si le titre de la page T-Shirts est affiché.
     *
     * @return true si le titre est visible, false sinon
     */
    public boolean tShirtTitleIsDisplayed() {
        return tShirtTitle.isDisplayed();
    }
}