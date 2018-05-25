a = 2
b = 2

# equals ==
# lesthan  <
# greater than  >
# less than or equals <=
 # greater than or equals >=
# not equal !=

#Decision making (pay attention to the indentaion
#after if statement)
if a == b:
    print("both the values are equal")
else:
    print("both the values are not equal")

if a > b:
    print("a's value is greater than b")
else:
    print("a's value is less than or equals to b")


#nested if
if a > b:
    print("a is greater than b")
elif a == b:
    print("a is equal to b")
    print("I am second statement in the elif block")
elif a < b:
    print("a is less than b")


