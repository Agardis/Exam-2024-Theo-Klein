const longestWord = (phrase) => {
    return phrase.split(" ").reduce((acc, curr) => {
        if(curr.length >= acc.length)
            return curr
        return acc
    }, "");
}

console.log(longestWord("a bc defh ghi"))
console.log(longestWord("a bc defh ghio"))