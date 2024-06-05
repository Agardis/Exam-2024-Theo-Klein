const counselers = [["Tchad", 2], ["Tommy", 9]]
const jason = 7

const killCount = (counselers, jason) => counselers.filter((counseler) => counseler[1] < jason).map((counseler) => counseler[0])


console.log(killCount(counselers, jason))
console.log(killCount([['Tiffany',4],['Jack',6],['Megan',7],['Tyler',3]], 6))