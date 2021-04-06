package pageObjects;

import elementMapper.HomePageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;


public class HomePage extends HomePageElementMapper {

    public HomePage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void clickSelectCategory() {
        selectCategoryBtn.click();
    }

    public void clickSelectCandy() {
        categoryCandy.click();
    }

    public void clickSelecDrinks(){
        categoryDrinks.click();
    }

    public void clickSelectAll(){
        categoryAll.click();
    }

    public void clickCartBtn(){
        cartBtn.click();
    }

}
