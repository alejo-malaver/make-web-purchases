package org.rosen.automation.project.commons;

import lombok.Data;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

@Data
public class CommonsInLists {
    public static List<WebElementFacade> getAllElementsForList(Target target) {
        return BrowseTheWeb.as(theActorInTheSpotlight())
                .findAll(By.cssSelector(target.getCssOrXPathSelector()));
    }
}
