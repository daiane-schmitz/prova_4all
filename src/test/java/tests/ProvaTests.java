package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.Test;
import pageObjects.*;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.assertTrue;

@Feature("Testes site 4all")
public class ProvaTests extends BaseTests{

    @Test
    @Story("Desafio 1")
    public void testFirstChallenge(){
        HomePage homePage = new HomePage();
        CandyPage candyPage = new CandyPage();
        CartPage cartPage = new CartPage();

        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        homePage.clickSelectCategory();
        homePage.clickSelectCandy();
        candyPage.clickAddChocolatBallToCart();
        candyPage.clickAddAlfajorToCart();
        homePage.clickCartBtn();
        cartPage.clickChocolateBallPlusBtn();
        cartPage.isQtdChocolateBallFive();
        cartPage.clickCheckOutBtn();
        cartPage.isSucessMessage();
        cartPage.clickCloseBtn();
    }


    @Test
    @Story("Desafio 2")
    public void testSecondChallenge(){
        HomePage homePage = new HomePage();
        DrinksPage drinksPage = new DrinksPage();
        AllPage allPage = new AllPage();
        CartPage cartPage = new CartPage();

        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        homePage.clickSelectCategory();
        homePage.clickSelecDrinks();
        drinksPage.clickAddCocaColaToCart();
        drinksPage.clickAddGrapeFantaToCart();
        drinksPage.clickAddWaterToCart();
        homePage.clickSelectCategory();
        homePage.clickSelectAll();
        allPage.clickAddRisoleToCart();
        homePage.clickCartBtn();
        cartPage.clickRisolePlusBtn();
        cartPage.isQtdRisoleNine();
        cartPage.clickRisoleMinusBtn();
        cartPage.isQtdRisoleFive();
        cartPage.isTotalPriceCorrect();
        cartPage.clickCheckOutBtn();
        cartPage.isSucessMessage();
        cartPage.clickCloseBtn();
    }

}
