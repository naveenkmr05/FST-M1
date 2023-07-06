# Get the copyright text

from selenium import webdriver
from selenium.webdriver.common.by import By

driver = webdriver.Firefox()
driver.get("http://alchemy.hguy.co/crm")

footerText = driver.find_element(By.ID, "admin_options").text
print(footerText)

assert footerText == "© Supercharged by SuiteCRM"
driver.quit()