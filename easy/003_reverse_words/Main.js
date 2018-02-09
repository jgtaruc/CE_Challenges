const fs = require('fs'),
      readline = require('readline');

(function main(args) {
    var filename = args[2];
    
    var reader = readline.createInterface({
        input: fs.createReadStream(filename),
        output: process.stdout,
        terminal: false
    });

    reader.on('line', function(line){
        if(line !== "") {
            console.log(reverse(line));
        }
    });

})(process.argv);

function reverse(line) {
    var arr = line.split(' ');
    var str = "";
    for(var i=arr.length-1; i>=0; i--) {
        str = str + arr[i];
        if(i!==0) {
            str += " ";
        }
    }
    return str;
}