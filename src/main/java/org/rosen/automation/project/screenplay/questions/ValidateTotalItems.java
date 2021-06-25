package org.rosen.automation.project.screenplay.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.rosen.automation.project.commons.CommonsInLists;
import org.rosen.automation.project.screenplay.pages.Main;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ValidateTotalItems {
    private static final String QUANTITY_PRODUCTS_EXPECTED = "10";

    public static void validateTotalProductsInShoppingCart() {
        List<WebElementFacade> listColorsForProduct =
                CommonsInLists.getAllElementsForList(Main.LISTS_OF_PRODUCTS_IN_SHOPPING_CART);
        theActorInTheSpotlight()
                .attemptsTo(
                        Ensure.that(Main.SHOPPING_CART_MENU_OPTION).isDisplayed(),
                        Scroll.to(Main.SHOPPING_CART_MENU_OPTION),
                        MoveMouse.to(Main.SHOPPING_CART_MENU_OPTION),
                        Ensure.that(Main.QUANTITY_PRODUCTS_IN_SHOPPING_CART).isDisplayed(),
                        Ensure.that(Main.QUANTITY_PRODUCTS_IN_SHOPPING_CART)
                                .text()
                                .isEqualTo(QUANTITY_PRODUCTS_EXPECTED),
                        Ensure.that(Main.LISTS_OF_PRODUCTS_IN_SHOPPING_CART).isDisplayed(),
                        Ensure.that(listColorsForProduct.size()).isEqualTo(Integer.parseInt(QUANTITY_PRODUCTS_EXPECTED)));
    }

    public static ValidateTotalItems is() {
        return new ValidateTotalItems();
    }
}
