package org.rosen.automation.project.screenplay.interactions;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class ClickInItemOption implements Interaction {
    private Target item;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(item));
    }

    public static ClickInItemOption itemOption(Target item) {
        return instrumented(ClickInItemOption.class, item);
    }
}
