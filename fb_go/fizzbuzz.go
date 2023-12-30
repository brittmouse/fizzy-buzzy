package main

import (
	"fmt"
	"strconv"
)

func fizzbuzz() (output [100]string) {
	for i := 1; i < 101; i++ {
		var result string
		if i%3 == 0 {
			result += "Fizz"
		}
		if i%5 == 0 {
			result += "Buzz"
		}
		if result == "" {
			result = strconv.Itoa(i)
		}
		output[i-1] = result
	}
	return output
}

func printArray(array [100]string) {
	for i := 0; i < len(array); i++ {
		fmt.Printf("%v ", array[i])
	}
}

func main() {
	printArray(fizzbuzz())
}
