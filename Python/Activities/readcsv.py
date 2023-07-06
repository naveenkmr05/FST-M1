import pandas as ptt
from pandas import ExcelWriter


# read csv and excel
csv_input = ptt.read_csv('../resources/employees.csv')
print(csv_input)

excel_input = ptt.read_excel('../resources/employees.xlxs')
print(excel_input)


# to write
data = {
    "Vehicle Type": ["Car", "Car", "Bike"],
    "Manufacturer": ["Maruti", "Toyota", "Royal Enfield"],
    "Model": ["Swift", "Corolla", "Thunderbird"]
}

table = ptt.DataFrame(data)

# csv write
table.to_csv('../resources/vehicle.csv', index= False)

# excel write
writer = ExcelWriter("../resources/vehicles.xlsx")
table.to_excel(writer, 'vehicles', index=False)
writer._save()