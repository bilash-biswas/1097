package main

import (
	"fmt"
)

func main() {
	var i, j, k int
	k = 6
	for i = 1; i <= 9; i = i + 2 {
		for j = i + k; j >= i+k-2; j-- {
			fmt.Printf("I=%d J=%d\n", i, j)
		}
	}
}
