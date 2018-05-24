
str1 = "I am a STring"

#print the entire string
print(str1)

#print a particular element  at an index

print(str1[3])

#slicing

print(str1[:9])

print(str1[2:9])

str2 = str1[3:10]

print(str2)

print(str2.lower())

print(str2.upper())

if 'z' in str2:
    print("found")
else:
    print("not found")


if 'a' not in str2:
    print("not found")
else:
    print("found")


a = "{} and {} are friends".format("jack", "jill")

print(a)

b = "{1} and {2} are friends but not {0}".format("jack", "jill", "john")

print(b)

#python 2.7 formatting

print "my name is %s and i am %d years old" % ("Srikant", 30)


# how do you assign a multi lined string to a variable

paragraph = """ I am a STring
m
I am a ST
am a ST
m a STr
m a str
M A STR
not found
found
jack and jill are friends
jill and john are friends but not jack
my name is Srikant and i am 30 years old"""

print(paragraph)

# string comparison

a = "srikant"

b = "Srikant"

print( a != b) #case senstitive

# if I don't care about case we can do the following

print(a.lower() == b.lower())
print(a.upper() == b.upper())

# removing extra spaces at the end and beginning of the string

d = "   Srikant   "
e = "Srikant"
print("{}end".format(d))
print("{}end".format(d.rstrip()))
print("{}end".format(d.lstrip()))
print("{}end".format(d.strip()))

print(d == e)
print(d.strip() == e.strip())


userdata = "Alex:Trainee:25:177"

userdatalist = userdata.split(":")
for i in userdatalist:
    print(i)


print("Name: {}\n Occupation: {}\n Age: {} \n Height: {} ".format(
userdatalist[0], userdatalist[1], userdatalist[2], userdatalist[3]
))
#join

text = "my new text is very long"
list_of_words = text.split()
print(list_of_words)

joiner = "$$$$"

print(joiner.join(list_of_words))

#find

print(str1.find('S'))
print(str1.find("Tr"))
#index

print(str1.index('S'))
#replace
print(str1.replace('a', '*'))

#can you do this?
#str1[2] = 'p'


a = "#"

#############################################

print(a*100)

b = "4"

c = a + b
print(c)













