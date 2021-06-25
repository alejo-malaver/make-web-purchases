package org.rosen.automation.project.screenplay.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Main extends PageObject {
    public static final Target WOMEN_MENU_OPTION =
            Target.the("'WOMEN' menu option").located(By.cssSelector("a[title='Women']"));
    public static final Target DRESSES_MENU_OPTION =
            Target.the("'DRESSES' menu option").located(By.cssSelector("#block_top_menu > ul > li:nth-of-type(2) > a[title='Dresses']"));
    public static final Target SHOPPING_CART_MENU_OPTION =
            Target.the("'SHOPPING CART' menu option").located(By.cssSelector("[title='View my shopping cart']"));
    public static final Target T_SHIRTS_SUBMENU_OPTION =
            Target.the("'T-Shirts' submenu option").locatedBy(".submenu-container a[title='T-shirts']");
    public static final Target BLOUSES_SUBMENU_OPTION =
            Target.the("'Blouses' submenu option").locatedBy(".submenu-container a[title='Blouses']");
    public static final Target CASUAL_DRESSES_SUBMENU_OPTION =
            Target.the("'Casual Dresses' submenu option").locatedBy("#block_top_menu > ul > li:nth-of-type(2) [title='Casual Dresses']");
    public static final Target EVENING_DRESSES_SUBMENU_OPTION =
            Target.the("'Evening Dresses' submenu option").locatedBy("#block_top_menu > ul > li:nth-of-type(2) [title='Evening Dresses']");
    public static final Target SUMMER_DRESSES_SUBMENU_OPTION =
            Target.the("'Summer Dresses' submenu option").locatedBy("#block_top_menu > ul > li:nth-of-type(2) [title='Summer Dresses']");
    public static final Target PRODUCT_IMAGE_DETAIL_OPTION =
            Target.the("Product image detail option").locatedBy(".product_img_link img");
    public static final Target PRODUCT_DETAIL_OPTION =
            Target.the("Product detail option").locatedBy(".quick-view > span");
    public static final Target IMAGE_IN_POPUP_WITH_PRODUCT_DETAIL =
            Target.the("Product detail option Popup").located(By.cssSelector("#image-block"));
    public static final String SELECTOR_FOR_IMAGE_IN_POPUP_WITH_PRODUCT_DETAIL = "//div[@id='center_column']/ul/li[*]";
    public static final Target LIST_COLORS_FOR_PRODUCT_OPTION =
            Target.the("List colors to select on the product").locatedBy(".col-lg-12.color-group > li");
    public static final Target LIST_SIZE_FOR_PRODUCT_OPTION =
            Target.the("List size to select on the product").locatedBy("div:nth-of-type(1) > .layered_filter_ul li");
    public static final String SELECTOR_FOR_COLOR_IN_PRODUCT_OPTION = "#color_to_pick_list > li:nth-child(*)";
    public static final String SELECTOR_FOR_SIZE_IN_PRODUCT_OPTION = "#group_1 [value='*']";
    public static final Target BUTTON_ADD_TO_CART_IN_POPUP =
            Target.the("Button for add products to the shopping cart in popup").locatedBy("p#add_to_cart button");
    public static final Target LIST_BUTTON_ADD_TO_CART =
            Target.the("List of buttons for add products to the shopping cart").locatedBy("a[title='Add to cart']");
    public static final Target BUTTON_CONTINUE_SHOPPING =
            Target.the("Button for continue shopping in web page").locatedBy("[title='Continue shopping'] span");
    public static final Target QUANTITY_PRODUCTS_IN_SHOPPING_CART =
            Target.the("Quantity products in shopping cart tittle").locatedBy("[title] .ajax_cart_quantity");
    public static final Target EMPTY_PRODUCTS_IN_SHOPPING_CART =
            Target.the("Quantity products in shopping cart tittle").locatedBy(".ajax_cart_no_product");
    public static final Target LISTS_OF_PRODUCTS_IN_SHOPPING_CART =
            Target.the("Lists of products in shopping cart").locatedBy(".products a.cart-images");
    public static final Target LISTS_OF_DELETE_PRODUCTS_OPTION_IN_SHOPPING_CART =
            Target.the("List of options for delete products in shopping cart").locatedBy(".products [rel]");
}
