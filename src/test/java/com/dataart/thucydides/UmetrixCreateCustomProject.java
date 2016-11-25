package com.dataart.thucydides;

import net.serenitybdd.jbehave.SerenityStories;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.embedder.StoryControls;

/**
 * Created by achernyshev on 25.11.2016.
 */
public class UmetrixCreateCustomProject extends SerenityStories {
    public UmetrixCreateCustomProject() {
        Configuration configuration = new MostUsefulConfiguration()
                .useStoryControls(new StoryControls().doResetStateBeforeScenario(false));
        findStoriesCalled("**/stories/UmetrixCreateCustomProject.story");
    }
}