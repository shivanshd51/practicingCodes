# printing name letter by letter 

high_temps = []

for row in rows:
    tds = row.find_all('td')
    
    # Check the length of tds to ensure it's not empty
    if len(tds) >= 7:
        for i in range(1, 7):
            high_temps.append(tds[i].text)
    else:
        print("Not enough <td> elements in the row.")

print(high_temps)
