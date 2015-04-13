package uk.sponte.automation.web.helpers;

import uk.sponte.automation.web.dependencies.DependencyFactory;

/**
 * Created by n450777 on 07/04/15.
 */
public class TestDiInstanceFactory implements DependencyFactory {
    @Override
    public TestDiInstance get() {
        return new TestDiInstance("secret");
    }
}
