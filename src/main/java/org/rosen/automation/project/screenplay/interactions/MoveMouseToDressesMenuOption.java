package org.rosen.automation.project.screenplay.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.MoveMouse;
import org.rosen.automation.project.screenplay.pages.Main;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MoveMouseToDressesMenuOption implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MoveMouse.to(Main.DRESSES_MENU_OPTION));
    }

    public static MoveMouseToDressesMenuOption menuOption() {
        return instrumented(MoveMouseToDressesMenuOption.class);
    }
}
