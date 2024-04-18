package qspAppsPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProKabbadiPointTableTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.prokabaddi.com/standings");
		String teamName = "Gujarat Giants";
		String playedGame = driver
				.findElement(By.xpath("//p[.='" + teamName
						+ "']/ancestor::div[@class='table-row-wrap']//div[@class='table-data matches-play']/p"))
				.getText();

		String matchesWon = driver
				.findElement(By.xpath("//p[.='" + teamName
						+ "']/ancestor::div[@class='table-row-wrap']//div[@class='table-data matches-won']/p"))
				.getText();

		String matchesLost = driver
				.findElement(By.xpath("//p[.='" + teamName
						+ "']/ancestor::div[@class='table-row-wrap']//div[@class='table-data matches-lost']/p"))
				.getText();

		String matchesDraw = driver
				.findElement(By.xpath("//p[.='" + teamName
						+ "']/ancestor::div[@class='table-row-wrap']//div[@class='table-data matches-draw']/p"))
				.getText();

		String totalPoint = driver.findElement(By.xpath(
				"//p[.='" + teamName + "']/ancestor::div[@class='table-row-wrap']//div[@class='table-data points']/p"))
				.getText();

		System.out.println(teamName + " :Total matches->" + playedGame + " Matches won->" + matchesWon
				+ " Matches Lost->" + matchesLost + " Matches Draw->" + matchesDraw+" Total Point->"+totalPoint);

	}

}
