function fizzbuzz() {
  let output = new Array;
  for (let i = 1; i <= 100; i++) {
    let result = ""
    if (i % 3 == 0) result += "Fizz"
    if (i % 5 == 0) result += "Buzz"
    if (result == "") result = i.toString()
    output.push(result)
  }
  return output
}

function printArray(array) {
  let output = "";
  for (let i = 0; i < array.length; i++) {
    output += array[i] + " ";
  }
  console.log(output);
}

printArray(fizzbuzz())
