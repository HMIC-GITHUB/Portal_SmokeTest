import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.driver.DriverFactory

WebDriver driver = DriverFactory.getWebDriver()

List<String> cellText = new ArrayList()

WebElement Table = driver.findElement(By.xpath('//table/tbody'))

List<WebElement> rows_table = Table.findElements(By.tagName('tr'))

int rows_count = rows_table.size()

println('Total no of rows in the table are :' + rows_count)

for (int row = 0; row < rows_count; row++) {
	List<WebElement> col_row = rows_table.get(row).findElements(By.tagName('td'))

	int col_count = col_row.size()

	println((('No of cells in row' + row) + 'are') + col_count)
	
	for(int col = 0; col < col_count ; col++) {
		
		String cellData = col_row.get(col).getText()
		
		println('Cell value of row '+row+ ' and column '+col+ ' is ' + cellData  )
		if(!(cellData.isEmpty())) {
			
			cellText.add(cellData)
			
		}
		
	}
	
}

return cellText

/*for(int i = 0;i<cellText.size();i++) {
	
	println(cellText.get(i))
	
}*/