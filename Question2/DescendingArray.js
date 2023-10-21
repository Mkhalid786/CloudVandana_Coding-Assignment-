function descendingSort(arr) {
    for (let i = 0; i < arr.length - 1; i++) {
        for (let j = 0; j < arr.length - 1 - i; j++) {
            if (arr[j] < arr[j + 1]) {
                // Swap the elements 
                const temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
const numbers = [5, 2, 9, 1, 4, 6];
descendingSort(numbers);
console.log(numbers); // Output: [9, 6, 5, 5, 2, 1]
