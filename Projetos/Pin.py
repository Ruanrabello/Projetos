def validate_pin(pin):
    pin = str(pin)
    return (len(pin) == 4 or len(pin) == 6) and pin.isdigit()


print(validate_pin(1234))
print(validate_pin('1T"q'))


# https://www.codewars.com/kata/55f8a9c06c018a0d6e000132/train/python
#! os () servem para ordem de acontecimentos
