package steps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.CommonMethods;

public class Hooks extends CommonMethods {

    @Before
    public void start(){
        openBrowserAndLaunchApplication();
    }
    @After
    public void end(Scenario scenario){
        //scenario class from cucumber hodls the complete information of the execution
        byte[] pic;

        if(scenario.isFailed()){
            pic=takeScreenshot("failed/"+scenario.getName());
        }else {
            pic=takeScreenshot("passed/"+scenario.getName());
        }

        //it will attach the screenshot in report
        scenario.attach(pic,"image/png",scenario.getName());
        closeBrowser();
    }


}
