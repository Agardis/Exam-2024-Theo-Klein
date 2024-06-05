var list1 = [
    {FirstName: 'Noah', lastName: 'M.', pays: 'Suisse', continent: 'Europe', age: 19, langue: 'C', Repas: 'végétarien'},
    {FirstName: 'Anna', lastName: 'R.', pays: 'Liechtenstein', continent: 'Europe', age: 52, langue: 'JavaScript', Repas: 'standard'},
    {FirstName: 'Ramona', lastName: 'R.', pays: 'Paraguay', continent: 'Amériques', age: 29, langue: 'Ruby', Repas: 'vegan'},
    {FirstName: 'George', lastName: 'B.', pays: 'Angleterre', continent: 'Europe', age: 81, langue: 'C', Repas: 'végétarien'},
    ];

const regimes = (list) => list.reduce((acc, curr) => {
        if (Object.keys(acc).find((key) => key == curr.Repas))
        {
            acc[curr.Repas] += 1
            return acc
        }
        Object.assign(acc, {[curr.Repas]: 1})
        return acc
    }, {})

console.log(regimes(list1))