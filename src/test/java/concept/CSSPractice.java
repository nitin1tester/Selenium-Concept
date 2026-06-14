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
     * Web table handing is not possible
     *
     * Using following Sibling (following sibling allowed)
     * this will give immediate next sibling
     * -currentTag[attr1='Value1'] + followingSilblingTag[attr1='value2']
     * this will give all following sibling option
     * - currentTag[attr1='value1'] ~ followindSiblingsTag
     * this will return based on index.
     * - tag:nth-of-child(index number / odd / even)
     * - tag:first-child
     * - tag:last-child
     * - tag:nth-last-child(number from last)
     * this will exclude that attribute from list.
     * - tag:not(attr='value')
     * - tag:not(attr1='value1'):not(attr2='value2')
     *
     *                          xpath               vs                  css
     *  1. syntex               complex                                 easy
     *  2. performance          good                                    good
     *  3. text                 Yes                                     No
     *  4. sibling              Yes                                     Limited(only following)
     *  5. child to parnet      Yes                                     No
     *  6. Parent to child      Yes                                     Yes
     *  7. backward triverse    Yes                                     No
     *  8. index                Yes                                     Yes(Good support)
     *  9. not                  Yes                                     Yes
     *  10 comma,union          Yes                                     Yes
     *  11 endswith             yes                                     yes
     *  12 contains             Yes                                     Yes
     *  13 startwith            Yes                                     Yes
     *  14 space                Yes                                     No
     *  15 svg                  Yes                                     Limited
     *  16 shodow Dom           No                                      Yes
     *  17 relative Locator     Yes                                     Yes
     *
     *
     */

    @Test(description = "CSS practice")
    public void testName() {



        driver.get("");

    }

}
