package com.Tamanna.stepdefinitions;

import com.Tamanna.interactions.OpenBrowser;
import com.Tamanna.questions.TotalAmountZero;
import com.Tamanna.questions.TotalValidatePrice;
import com.Tamanna.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PurchasesStepdefinitions {
    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("(.*) is on Homepage")
    public void theUserIsOnHomepage(String actor) {
        theActorCalled(actor).attemptsTo(OpenBrowser.tamanna());
    }

    @Then("the user clicks Women")
    public void theUserClicksWomen() {
        theActorInTheSpotlight().attemptsTo(WomenTask.theWomen());
    }

    @Then("the user clicks Men")
    public void theUserClicksMen() {
        theActorInTheSpotlight().attemptsTo(MenTask.theMen());
    }

    @Then("user clicks Beauty")
    public void userClicksBeauty (){
        theActorInTheSpotlight().attemptsTo(BeautyTask.theBeautyCat());
    }

    @Then("User Clicks Accessories")
    public void userClicksAccessories() {
        theActorInTheSpotlight().attemptsTo(AccessoriesTask.theAccessories());
    }

    @Then("the user is returned to the homepage")
    public void theUserIsReturnedToTheHomepage() {
        theActorInTheSpotlight().attemptsTo(HomePageTask.inHomePage());
    }

    @Then("user clicks Beauty Product")
    public void userClicksBeautyProduct() {
        theActorInTheSpotlight().attemptsTo(BeautyProductTask.thebeautyproduct());
    }

    @Then("User Clicks Accessories product")
    public void userClicksAccessoriesProduct() {
        theActorInTheSpotlight().attemptsTo(AccessoriesProductTask.inAccessoriesProduct());
    }

    @Then("user clicks on add to cart")
    public void userClicksOnAddToCart() {
        theActorInTheSpotlight().attemptsTo(AddToCartTask.inAddCart());
    }

    @Then("the user clicks Cart")
    public void theUserClicksCart() {
        theActorInTheSpotlight().attemptsTo(CartTask.theCart());
    }

    @Then("user verifies the total price")
    public void userVerifiesTheTotalProducts() {
        theActorInTheSpotlight().should(seeThat(TotalValidatePrice.theCartProducts(),Matchers.is(false)));
    }

    @Then("User Clicks ShoppingBag")
    public void userClicksShoppingBag() {
        theActorInTheSpotlight().attemptsTo(ShoppingBagTask.inShoppingBag());
    }

    @Then("User Clicks on RemoveItems from Cart")
    public void userClicksOnRemoveItemsFromCart() {
        theActorInTheSpotlight().attemptsTo(EmptyCartTask.removeitems());
    }

    @Then("User verifies that total is zero")
    public void userVerifiesThatTotalIsZero() {
        theActorInTheSpotlight().should(seeThat(TotalAmountZero.theAmount(),Matchers.is(true)));
    }

    @Then("user is taken to the Authentication screen")
    public void userIsTakenToTheAuthenticationScreen() {
        theActorInTheSpotlight().attemptsTo(Authentication.inAuthentication());
    }

}

