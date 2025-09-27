package UtilityAmazonProject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;





public class Screenshot {
	public static void main(String[] args) throws IOException {
	
	EdgeDriver driver = new EdgeDriver();
	
	TakesScreenshot ts = driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject\\screenshotAB55\\priya"+new Screenshot() +Math.random()+".png");
	FileHandler.copy(source, destination);   
	
}}
