const image = [ 
    [[123, 231, 12], [56, 43, 124]],
    [[78, 152, 76], [64, 132, 200]]
    ]

const toGrey = (image) => image.map((list) => list.map(([red, green, blue]) => {
        const pixel = Math.round((red+green+blue)/3)
        return [pixel, pixel, pixel]
    }))

console.log(toGrey(image))