package stepDefinitions;

import cucumber.api.java.en.Given;
import org.testng.Assert;

public class DocStringDemo {

    @Given("^a blog post named with Markdown body$")
    public void a_blog_post_named_with_Markdown_body(String arg1){
        System.out.println("Argument1: " + arg1);
        Assert.assertEquals(arg1, "Doc Strings are handy for passing a larger piece of text to a step definition.");

    }

}
