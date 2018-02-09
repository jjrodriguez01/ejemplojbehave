package com.qvision.jbehaveMixto;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Properties;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.Keywords;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.i18n.LocalizedKeywords;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.parsers.RegexStoryParser;
import org.jbehave.core.reporters.ConsoleOutput;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.jbehave.core.steps.MarkUnmatchedStepsAsPending;
import com.qvision.jbehaveMixto.steps.JbehaveMixtoSteps;

public class JbehaveMixto extends JUnitStories{


	@Override
    public Configuration configuration() {
       return new MostUsefulConfiguration()
    		   .useStoryReporterBuilder(new StoryReporterBuilder()
               .withDefaultFormats()
               .withFormats(Format.CONSOLE, 
               		Format.TXT, Format.HTML, Format.XML)
               .withFailureTrace(false));
         
    }

	
    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new JbehaveMixtoSteps());
    }
 
    @Override
    protected List<String> storyPaths() {
        return new StoryFinder().findPaths(
        		CodeLocations.codeLocationFromClass(
        				this.getClass()),
        				Arrays.asList("**/*.story"), null);
    }

}
