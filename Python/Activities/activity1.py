
name = input( "What is your name: " )
age = int( input( "How old are you: " ) )
year = str( ( 2023 - age ) + 100 )
print( name + " will be 100 years old in the year " + year )

if len(name) > 5:
    print('name is too long')
else:
    print('name is right length')