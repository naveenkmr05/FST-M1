#Traversing tables
import time

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

driver = webdriver.Firefox()
driver.get("http://alchemy.hguy.co/crm")

driver.find_element(By.ID, "user_name").send_keys("admin")
driver.find_element(By.ID, "username_password").send_keys("pa$$w0rd")
driver.find_element(By.NAME, "Login").click()
time.sleep(2.0)

sales = driver.find_element(By.XPATH, "//span/a[text()='Sales']")
accounts = driver.find_element(By.XPATH, "//span/ul/li/a[text()='Accounts']")

sales.click()
accounts.click()

wait = WebDriverWait(driver, 10)
wait.until(EC.visibility_of_element_located((By.XPATH, "//tr[@class='oddListRowS1']")))

names = driver.find_elements(By.XPATH, "//tr[@class='oddListRowS1']/td[@field='name']")
for i in range(5):
    print(names[i].text)

driver.quit()