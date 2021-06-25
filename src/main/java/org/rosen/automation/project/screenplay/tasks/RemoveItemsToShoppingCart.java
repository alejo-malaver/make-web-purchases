package org.rosen.automation.project.screenplay.tasks;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;
import org.rosen.automation.project.commons.CommonsInLists;
import org.rosen.automation.project.screenplay.interactions.*;
import org.rosen.automation.project.screenplay.pages.Main;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class RemoveItemsToShoppingCart implements Task {
    public static RemoveItemsToShoppingCart removeProducts() {
        return instrumented(RemoveItemsToShoppingCart.class);
    }

    @Step("{0} remove products from the shopping cart")
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listColorsForProduct =
                CommonsInLists.getAllElementsForList(Main.LISTS_OF_DELETE_PRODUCTS_OPTION_IN_SHOPPING_CART);
        listColorsForProduct.forEach(product -> actor.attemptsTo(ClickInDeleteProductButton.deleteProductButton(product)));
    }
}