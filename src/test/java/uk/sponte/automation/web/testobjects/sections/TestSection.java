package uk.sponte.automation.web.testobjects.sections;

import org.openqa.selenium.support.FindBy;
import uk.sponte.automation.web.PageElement;
import uk.sponte.automation.web.PageSection;

import java.util.List;

/**
 * Created by n450777 on 08/04/15.
 */
public class TestSection extends PageSection {
    @FindBy(tagName = "h1")
    public PageElement headline;

    @FindBy(tagName = "h2")
    public PageElement subtitle;

    @FindBy(tagName = "li")
    public List<PageElement> listItems;
}
