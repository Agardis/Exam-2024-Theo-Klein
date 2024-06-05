
const pourboire = (prix, note) => {
    switch (note.toLowerCase()) {
        case 'terrible':
            return Math.ceil(prix * 0);
        case 'poor':
            return Math.ceil(prix * 0.05);
        case 'good':
            return Math.ceil(prix * 0.1);
        case 'great':
            return Math.ceil(prix * 0.15);
        case 'excellent':
            return Math.ceil(prix * 0.2);
        default:
            return 'Rating not recognised';
    }
}

console.log(pourboire(15, 'Terrible'))
console.log(pourboire(15, 'terrible'))
console.log(pourboire(15, 'Poor'))
console.log(pourboire(15, 'poor'))
console.log(pourboire(15, 'Good'))
console.log(pourboire(15, 'good'))
console.log(pourboire(15, 'Great'))
console.log(pourboire(15, 'great'))
console.log(pourboire(15, 'Excellent'))
console.log(pourboire(15, 'excellent'))
console.log(pourboire(15, 'sljfhgebnjfsl'))
