//deklarasi prompt
const prompt = require('prompt-sync')()

//function
function PersegiPanjang(panjang, lebar) {
    this.panjang = panjang
    this.lebar = lebar
}

PersegiPanjang.prototype.getLuas = function () {
    var luas = this.panjang * this.lebar
    console.log('Luas\t: ', this.panjang, ' x ', this.lebar, ' : ', luas)
}

PersegiPanjang.prototype.print = function() {
    console.log('Panjang Sisi\t: ', this.panjang)
    console.log('Lebar Sisi\t: ', this.lebar)
}

//turunan fungsi
function Persegi(sisi){
    this.panjang = sisi
    this.lebar = sisi
}

//inherit fungsi
Persegi.prototype = new PersegiPanjang()
Persegi.prototype.constructor = PersegiPanjang

//redefinisi fungsi
Persegi.prototype.print = function(){
    console.log('Panjang Sisi\t: ', this.panjang)
}

console.log('Input Persegi Panjang')
var obPersegiPanjang = new PersegiPanjang(
    prompt('Masukan panjang\t: '),
    prompt('Masukan lebar\t: ')
)

console.log('\nInput Persegi')
var obPersegi = new Persegi(
    prompt('Masukan Panjang Sisi\t: ')
)
console.log('\nMenghitung Luas Persegi Panjang')
obPersegiPanjang.print()
obPersegiPanjang.getLuas()

console.log('\nMenghitung Luas Persegi')
obPersegi.print()
obPersegi.getLuas()