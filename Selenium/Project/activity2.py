# Get the url of the header image

from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Firefox()
driver.get("http://alchemy.hguy.co/crm")

header = driver.find_element(By.XPATH, "//div[@class='companylogo']/img").get_attribute("src")
print(header)
driver.quit()