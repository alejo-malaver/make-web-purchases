package org.rosen.automation.project.screenplay.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import org.rosen.automation.project.commons.CommonsInLists;
import org.rosen.automation.project.screenplay.interactions.*;
import org.rosen.automation.project.screenplay.pages.Main;

import java.util.List;
import java.util.stream.IntStream;

@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class AddItemsToShoppingCart implements Task {
    public static final String charToReplace = "*";
    public static AddItemsToShoppingCart addItems() {
        return instrumented(AddItemsToShoppingCart.class);
    }

    @Step("{0} add 10 unique items to shopping cart")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MoveMouseToWomenMenuOption.menuOption(),
                ClickInTShirtsSubmenuOption.submenuOption());

        List<WebElementFacade> listColorsForProduct =
                CommonsInLists.getAllElementsForList(Main.LIST_COLORS_FOR_PRODUCT_OPTION);
        int sizeColors = listColorsForProduct.size();
        IntStream.range(0, sizeColors).forEach(index -> addProductsFilterIntoShoppingCart(actor, index, Main.SELECTOR_FOR_COLOR_IN_PRODUCT_OPTION));

        actor.attemptsTo(MoveMouseToWomenMenuOption.menuOption(),
                ClickInBlousesSubmenuOption.submenuOption());

        List<WebElementFacade> listSizesForProduct =
                CommonsInLists.getAllElementsForList(Main.LIST_SIZE_FOR_PRODUCT_OPTION);
        int sizeSizes = listSizesForProduct.size();
        IntStream.range(0, sizeSizes).forEach(index -> addProductsFilterIntoShoppingCart(actor, index, Main.SELECTOR_FOR_SIZE_IN_PRODUCT_OPTION));

        actor.attemptsTo(MoveMouseToDressesMenuOption.menuOption(),
                ClickInCasualDressesSubmenuOption.submenuOption());

        final List<WebElementFacade> listAddButtonsCasualDresses =
                CommonsInLists.getAllElementsForList(Main.LIST_BUTTON_ADD_TO_CART);
        int sizeButtons = listAddButtonsCasualDresses.size();
        IntStream.range(0, sizeButtons).forEach(index -> addProductsIntoShoppingCart(actor, index, Main.SELECTOR_FOR_IMAGE_IN_POPUP_WITH_PRODUCT_DETAIL, listAddButtonsCasualDresses.get(index)));

        actor.attemptsTo(MoveMouseToDressesMenuOption.menuOption(),
                ClickInEveningDressesSubmenuOption.submenuOption());

        final List<WebElementFacade> listAddButtonsEveningDresses =
                CommonsInLists.getAllElementsForList(Main.LIST_BUTTON_ADD_TO_CART);
        sizeButtons = listAddButtonsEveningDresses.size();
        IntStream.range(0, sizeButtons).forEach(index -> addProductsIntoShoppingCart(actor, index, Main.SELECTOR_FOR_IMAGE_IN_POPUP_WITH_PRODUCT_DETAIL, listAddButtonsEveningDresses.get(index)));

        actor.attemptsTo(MoveMouseToDressesMenuOption.menuOption(),
                ClickInSummerDressesSubmenuOption.submenuOption());

        final List<WebElementFacade> listAddButtonsSummerDresses =
                CommonsInLists.getAllElementsForList(Main.LIST_BUTTON_ADD_TO_CART);
        sizeButtons = listAddButtonsSummerDresses.size();
        IntStream.range(0, sizeButtons).forEach(index -> addProductsIntoShoppingCart(actor, index, Main.SELECTOR_FOR_IMAGE_IN_POPUP_WITH_PRODUCT_DETAIL, listAddButtonsSummerDresses.get(index)));
    }

    public static void addProductsFilterIntoShoppingCart(Actor actor, int index, String selectorBase){
        Target itemOption = generateTarget(selectorBase, index);

        actor.attemptsTo(ClickOnDeployPopupWithProductDetail.productDetailOption(),
                LoadingPopupInteractions.validateLoadingPopup(),
                ClickInItemOption.itemOption(itemOption),
                ClickInAddToCartButton.addToCartButton(),
                ClickInContinueShoppingButton.continueShoppingButton());
    }

    public static void addProductsIntoShoppingCart(Actor actor, int index, String selectorBase, WebElementFacade button){
        Target imageOption = generateTarget(selectorBase, index);
        actor.attemptsTo(
                ClickInAddButtonForList.buttonOption(imageOption, button),
                ClickInContinueShoppingButton.continueShoppingButton());
    }

    public static Target generateTarget(String selectorBase, int index){
        String selector = selectorBase.replace(charToReplace, String.valueOf(index+1));
        return Target.the("Option to select").locatedBy(selector);
    }
}