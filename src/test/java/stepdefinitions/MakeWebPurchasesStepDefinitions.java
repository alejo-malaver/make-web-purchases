package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.rosen.automation.project.screenplay.questions.ValidateTotalItemsIsEmpty;
import org.rosen.automation.project.screenplay.tasks.AddItemsToShoppingCart;
import org.rosen.automation.project.screenplay.tasks.OpenApp;
import org.rosen.automation.project.screenplay.questions.ValidateTotalItems;
import org.rosen.automation.project.screenplay.tasks.RemoveItemsToShoppingCart;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class MakeWebPurchasesStepDefinitions {
    private static String actorName = "Alejandro";

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("there is a user browsing the {string} web page")
    public void aUserBrowsingInTheWebPage(String page) {
        theActorCalled(actorName).attemptsTo(OpenApp.main(page));
    }

    @When("add 10 unique items to shopping cart")
    public void addItemsToShoppingCart() {
        theActorInTheSpotlight().attemptsTo(AddItemsToShoppingCart.addItems());
        ValidateTotalItems.validateTotalProductsInShoppingCart();
    }

    @And("remove all items from shopping cart, one by one")
    public void removeAllItemsToShoppingCart(){
        theActorInTheSpotlight().attemptsTo(RemoveItemsToShoppingCart.removeProducts());
    }

    @Then("the shopping cart is empty")
    public void validateIfShorppingCartIsEmpty(){
        ValidateTotalItemsIsEmpty.validateShoppingCartIsEmpty();
    }
}
