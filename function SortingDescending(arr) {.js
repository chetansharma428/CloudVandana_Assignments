function SortingDescending(arr) {
    var n = arr.length;
    for (var i = 0; i < n - 1; i++) {
        for (var j = 0; j < n - 1 - i; j++) {
            if (arr[j] < arr[j + 1]) {
                // Swap the elements if they are in the wrong order
                var temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    return arr;
}

function getUserInput() {
    var inputArray = [];
    var input = "";
    //taking input from user and checking whether its a valid input or not
    do {
        input = prompt("Enter a number (or press 'Cancel' to finish):");
        if (input !== null) {
            inputArray.push(parseFloat(input));
        }
    } while (input !== null && !isNaN(input));

    return inputArray;
}

var userArray = getUserInput();
if (userArray.length > 0) {
    var sortedArray = SortingDescending(userArray);
    console.log("Sorted Array in Descending Order: " + sortedArray);
} else {
    console.log("No valid numbers were entered.");
}
