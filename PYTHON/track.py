import phonenumbers
from phonenumbers import carrier, geocoder, timezone

# Example number (use country code, e.g., +91 for India, +1 for USA)
number = input("enter the number followed by country code:")

# Parse number
phone = phonenumbers.parse(number)

# Get timezone
print("Time Zones:", timezone.time_zones_for_number(phone))

# Get carrier
print("Carrier:", carrier.name_for_number(phone, "en"))

# Get region
print("Region:", geocoder.description_for_number(phone, "en"))

# Check if valid
print("Valid Number:", phonenumbers.is_valid_number(phone))
