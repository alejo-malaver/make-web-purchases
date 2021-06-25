package org.rosen.automation.project.screenplay.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.rosen.automation.project.commons.CommonsInLists;
import org.rosen.automation.project.screenplay.pages.Main;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ValidateTotalItemsIsEmpty {
    private static final String EMPTY_MESSAGE_EXPECTED = "(empty)";

    public static void validateShoppingCartIsEmpty() {
        List<WebElementFacade> listColorsForProduct =
                CommonsInLists.getAllElementsForList(Main.LISTS_OF_PRODUCTS_IN_SHOPPING_CART);
        theActorInTheSpotlight()
                .attemptsTo(
                        Ensure.that(Main.EMPTY_PRODUCTS_IN_SHOPPING_CART).isDisplayed(),
                        Ensure.that(Main.EMPTY_PRODUCTS_IN_SHOPPING_CART)
                                .text()
                                .isEqualTo(EMPTY_MESSAGE_EXPECTED),
                        Ensure.that(Main.LISTS_OF_PRODUCTS_IN_SHOPPING_CART).isNotDisplayed(),
                        Ensure.that(listColorsForProduct).isEmpty());
    }

    public static ValidateTotalItemsIsEmpty is() {
        return new ValidateTotalItemsIsEmpty();
    }
}
