package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElementMapper {


    @FindBy(id = "open-categories-btn")
    public WebElement selectCategoryBtn;

    @FindBy(id = "cart-btn")
    public WebElement cartBtn;

    @FindBy(id = "category-0")
    public WebElement categoryDrinks;

    @FindBy(id = "category-1")
    public WebElement categoryCandy;

    @FindBy(id = "category-all")
    public WebElement categoryAll;

}
