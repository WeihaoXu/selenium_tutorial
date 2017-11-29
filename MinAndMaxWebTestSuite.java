package selenium_tutorial;

import static org.junit.Assert.*;

import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class MinAndMaxWebTestSuite {
	private static WebDriver wd;
	private static WebElement we;
	private static WebElement result;
	private static WebElement minButton;
	@BeforeClass
	public static void setUpClass(){
		wd = new FirefoxDriver();
		wd.get("file://" + new File("").getAbsolutePath() + "/minandmax.html");
	}
	@Test
	public void Test0(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test1(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test2(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test3(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test4(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test5(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test6(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test7(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test8(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test9(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test10(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test11(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test12(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test13(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test14(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test15(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test16(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test17(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test18(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test19(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test20(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test21(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test22(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test23(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test24(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test25(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test26(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test27(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test28(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test29(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test30(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test31(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test32(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test33(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test34(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test35(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test36(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test37(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test38(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test39(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test40(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test41(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test42(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test43(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test44(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test45(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test46(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test47(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test48(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test49(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test50(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test51(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test52(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test53(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test54(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test55(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test56(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test57(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test58(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test59(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test60(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test61(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test62(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test63(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test64(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test65(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test66(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test67(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test68(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test69(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test70(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test71(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test72(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test73(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test74(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test75(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test76(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test77(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test78(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test79(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test80(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test81(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test82(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test83(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test84(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-3, -3, -3) = -3", output);
	}
	@Test
	public void Test85(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("max(-3, -3, -3) = -3", output);
	}
	@Test
	public void Test86(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test87(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test88(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-3, -3, 0) = -3", output);
	}
	@Test
	public void Test89(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("max(-3, -3, 0) = 0", output);
	}
	@Test
	public void Test90(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test91(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test92(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-3, -3, 7) = -3", output);
	}
	@Test
	public void Test93(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("max(-3, -3, 7) = 7", output);
	}
	@Test
	public void Test94(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test95(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test96(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test97(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test98(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test99(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test100(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-3, 0, -3) = -3", output);
	}
	@Test
	public void Test101(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("max(-3, 0, -3) = 0", output);
	}
	@Test
	public void Test102(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test103(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test104(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-3, 0, 0) = -3", output);
	}
	@Test
	public void Test105(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("max(-3, 0, 0) = 0", output);
	}
	@Test
	public void Test106(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test107(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test108(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-3, 0, 7) = -3", output);
	}
	@Test
	public void Test109(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("max(-3, 0, 7) = 7", output);
	}
	@Test
	public void Test110(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test111(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test112(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test113(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test114(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test115(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test116(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-3, 7, -3) = -3", output);
	}
	@Test
	public void Test117(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("max(-3, 7, -3) = 7", output);
	}
	@Test
	public void Test118(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test119(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test120(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-3, 7, 0) = -3", output);
	}
	@Test
	public void Test121(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("max(-3, 7, 0) = 7", output);
	}
	@Test
	public void Test122(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test123(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test124(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(-3, 7, 7) = -3", output);
	}
	@Test
	public void Test125(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("max(-3, 7, 7) = 7", output);
	}
	@Test
	public void Test126(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test127(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test128(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test129(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test130(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test131(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test132(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test133(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test134(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test135(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test136(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test137(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test138(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test139(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test140(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test141(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test142(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test143(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test144(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test145(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test146(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test147(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test148(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, -3, -3) = -3", output);
	}
	@Test
	public void Test149(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("max(0, -3, -3) = 0", output);
	}
	@Test
	public void Test150(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test151(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test152(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, -3, 0) = -3", output);
	}
	@Test
	public void Test153(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("max(0, -3, 0) = 0", output);
	}
	@Test
	public void Test154(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test155(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test156(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, -3, 7) = -3", output);
	}
	@Test
	public void Test157(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("max(0, -3, 7) = 7", output);
	}
	@Test
	public void Test158(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test159(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test160(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test161(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test162(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test163(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test164(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, 0, -3) = -3", output);
	}
	@Test
	public void Test165(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("max(0, 0, -3) = 0", output);
	}
	@Test
	public void Test166(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test167(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test168(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, 0, 0) = 0", output);
	}
	@Test
	public void Test169(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("max(0, 0, 0) = 0", output);
	}
	@Test
	public void Test170(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test171(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test172(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, 0, 7) = 0", output);
	}
	@Test
	public void Test173(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("max(0, 0, 7) = 7", output);
	}
	@Test
	public void Test174(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test175(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test176(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test177(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test178(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test179(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test180(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, 7, -3) = -3", output);
	}
	@Test
	public void Test181(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("max(0, 7, -3) = 7", output);
	}
	@Test
	public void Test182(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test183(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test184(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, 7, 0) = 0", output);
	}
	@Test
	public void Test185(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("max(0, 7, 0) = 7", output);
	}
	@Test
	public void Test186(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test187(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test188(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(0, 7, 7) = 0", output);
	}
	@Test
	public void Test189(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("max(0, 7, 7) = 7", output);
	}
	@Test
	public void Test190(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test191(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("0");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test192(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test193(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test194(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test195(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test196(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test197(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test198(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test199(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test200(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test201(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test202(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test203(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test204(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test205(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test206(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test207(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test208(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test209(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test210(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test211(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test212(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(7, -3, -3) = -3", output);
	}
	@Test
	public void Test213(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("max(7, -3, -3) = 7", output);
	}
	@Test
	public void Test214(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test215(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test216(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(7, -3, 0) = -3", output);
	}
	@Test
	public void Test217(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("max(7, -3, 0) = 7", output);
	}
	@Test
	public void Test218(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test219(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test220(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(7, -3, 7) = -3", output);
	}
	@Test
	public void Test221(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("max(7, -3, 7) = 7", output);
	}
	@Test
	public void Test222(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test223(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test224(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test225(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test226(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test227(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test228(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(7, 0, -3) = -3", output);
	}
	@Test
	public void Test229(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("max(7, 0, -3) = 7", output);
	}
	@Test
	public void Test230(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test231(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test232(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(7, 0, 0) = 0", output);
	}
	@Test
	public void Test233(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("max(7, 0, 0) = 7", output);
	}
	@Test
	public void Test234(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test235(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test236(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(7, 0, 7) = 0", output);
	}
	@Test
	public void Test237(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("max(7, 0, 7) = 7", output);
	}
	@Test
	public void Test238(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test239(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("0");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test240(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test241(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("Please enter integer values only!", output);
	}
	@Test
	public void Test242(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test243(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("infinity");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test244(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(7, 7, -3) = -3", output);
	}
	@Test
	public void Test245(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("max(7, 7, -3) = 7", output);
	}
	@Test
	public void Test246(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test247(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("-3");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test248(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(7, 7, 0) = 0", output);
	}
	@Test
	public void Test249(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("max(7, 7, 0) = 7", output);
	}
	@Test
	public void Test250(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test251(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("0");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test252(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("min(7, 7, 7) = 7", output);
	}
	@Test
	public void Test253(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		we.click();
		result = wd.findElement(By.id("result"));
		String output = result.getText();
		assertEquals("max(7, 7, 7) = 7", output);
	}
	@Test
	public void Test254(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		minButton.click();
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@Test
	public void Test255(){
		wd.navigate().refresh();
		minButton = wd.findElement(By.id("min"));
		we = wd.findElement(By.id("x"));
		we.sendKeys("7");
		we = wd.findElement(By.id("y"));
		we.sendKeys("7");
		we = wd.findElement(By.id("z"));
		we.sendKeys("7");
		we = wd.findElement(By.id("computeButton"));
		result = wd.findElement(By.id("result"));
		String output = result.getText();
	}
	@AfterClass
	public static void tearDownClass(){
		wd.quit();
	}
}
