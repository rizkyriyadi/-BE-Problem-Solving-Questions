package main

import (
	"fmt"
)

func main() {
	var students, candy, firstStudent int

	fmt.Print("Input(students, candy, First Student) = ")
	fmt.Scan(&students, &candy, &firstStudent)

	fmt.Println()
	fmt.Println("Students = ", students)
	fmt.Println("Candy = ", candy)
	fmt.Println("First Students = ", firstStudent)

	// Logic
	firstStudent -= 1
	for i := candy; i != 0; i-- {
		if firstStudent == students {
			firstStudent = 0
		}
		firstStudent += 1

		// fmt.Println(" ", firstStudent)

	}
	fmt.Print("Sour Student = ", firstStudent)

}
