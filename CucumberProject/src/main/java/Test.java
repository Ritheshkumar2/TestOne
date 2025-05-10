import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class Test {
	
	@CucumberOptions(features="C:\\Users\\hp\\eclipse-workspace\\com.basic\\src\\test\\java\\com\\basic\\featurefiles1",glue="stepDef",
			monochrome=true,plugin={"pretty"},tags="@tag")
	public class TestOne extends AbstractTestNGCucumberTests{
		

	}

}
