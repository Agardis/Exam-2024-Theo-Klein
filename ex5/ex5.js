
const square = (number) => number.toString().split("").map((num) => (num * num).toString()).join("")

console.log(square(9119))
