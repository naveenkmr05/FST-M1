#Getting colors
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.color import Color

driver = webdriver.Firefox()
driver.get("http://alchemy.hguy.co/crm")

driver.find_element(By.ID, "user_name").send_keys("admin")
driver.find_element(By.ID, "username_password").send_keys("pa$$w0rd")
driver.find_element(By.NAME, "Login").click()

toolbar = driver.find_element(By.ID,"toolbar")
toolbarColor = toolbar.value_of_css_property("color")

#convert rgba to hex
hexColor = Color.from_string(toolbarColor).hex
print("Color is :" + toolbarColor)
print("Hex code for color:" + hexColor)

driver.quit()