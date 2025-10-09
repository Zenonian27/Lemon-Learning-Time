let prints: string = "Hello World"
let woo: string = "Wooo"

class fuckyou{
    
    woo: string;
    
    constructor(woo: string){
        this.woo = woo;
    }

    printMe(){
    return console.log("fuck you " + woo);
    }

    test(){
    var a: number = 10;
    var b: number = 15;
    
    if(a <  b){
        console.log(a +" less than " + b);
    }
}
}

class main extends fuckyou{

    runAll(fuck: string){
        console.log(fuck)
    }
}    

function runAlls(){
    const app = new main(woo);
    app.runAll(woo);
    app.printMe();
    app.test();

}

runAlls();

//interface can be passed as parameters to
//functions
