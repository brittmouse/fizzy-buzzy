def fizzbuzz():
    output = []
    for i in range(1, 101):
        result: str = ""
        if i % 3 == 0:
            result += "Fizz"
        if i % 5 == 0:
            result += "Buzz"
        if result == "":
            result = str(i)
        output.append(result)
    return output


def printList(list_in):
    for i in list_in:
        print(i, end=" ")


printList(fizzbuzz())
