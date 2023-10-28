function reverseWordsInSentence(sentence) {
    const words = sentence.split(" "); // Split the sentence into words
    const reversedWords = [];

    for (let i = 0; i < words.length; i++) {
        const word = words[i];
        const reversedWord = word.split("").reverse().join(""); // Reverse each word
        reversedWords.push(reversedWord);
    }

    const reversedSentence = reversedWords.join(" "); // Reconstruct the reversed sentence

    return reversedSentence;
}

// Example usage:
const inputSentence = prompt("Please Enter The Sentence you want to reverse");
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log(reversedSentence); // Output
