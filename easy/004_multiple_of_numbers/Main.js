const fs = require('fs'),
      readline = require('readline');

(function main(args){
    var filename = args[2];
    
    var reader = readline.createInterface({
        input: fs.createReadStream(filename),
        output: process.stdout,
        terminal: false
    });

    reader.on('line', function(line){
        if(line !== "") {
            var arr = line.split(',');
            console.log(minMultiple(parseInt(arr[0]), parseInt(arr[1])));
        }
    });

})(process.argv);

function minMultiple(x, n) {
    var temp = n;
    var i = 1;
    while(temp < x) {
        temp = n * i;
        i++;
    }

    return temp
}