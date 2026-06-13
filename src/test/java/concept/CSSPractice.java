package concept;

import base.Base;
import org.testng.annotations.Test;

public class CSSPractice extends Base {

    /**
     * CSS:- cascaded style sheet
     * cssSelector: Locator
     *
     * Using id
     * - #id
     * - tag#id
     *
     * Using class
     * - .classname
     * - tag.classname
     * - c1.c2.c3
     * - tag.c1.c2.c3
     *
     * Using Id and Class togater
     * - #id.classname
     * - .classname#id
     * - tag.classname#id
     *
     * Using other attribute
     * - tag[attr='value']
     * - tag[attr1='value1'][attr2='value2']
     * - tag[attr1][attr2]
     * - tag[attr1='value'].classname#id
     *
     * Note:-  Text support is not available
     *
     * Using contains:
     * - tag[attr *= 'any partials value']
     *
     * Using Starts with
     * - tag[attr ^= 'value start with' ]
     *
     * Using Ends with
     * - tag[attr $= 'value ends with']
     *
     * Using Parent child
     * - parenttag childtag --> direct/ indirect child
     * - parenttag > childtag --> direct child
     *
     * Note:- Child to Parent is not available
     *
     * Using following Sibling
     * -
     *
     *
     *
     *
     *
     *
     */

    @Test(description = "CSS practice")
    public void testName() {



        driver.get("");

    }

}
