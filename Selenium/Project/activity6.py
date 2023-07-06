#Menu checking
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.color import Color

driver = webdriver.Firefox()
driver.get("http://alchemy.hguy.co/crm")

driver.find_element(By.ID, "user_name").send_keys("admin")
driver.find_element(By.ID, "username_password").send_keys("pa$$w0rd")
driver.find_element(By.NAME, "Login").click()

driver.find_element(By.XPATH, "//span/a[text()='Activities']").is_displayed()
print(driver.find_element(By.XPATH, "//span/a[text()='Activities']").text)

driver.quit()