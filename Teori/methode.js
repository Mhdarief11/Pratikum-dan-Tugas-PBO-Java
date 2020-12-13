const prompt = require('prompt-sync')()


let total = prompt('Berapa Input Mahasiswa\t: ')

var array = [] //deklarasi array
var mahasiswa = {} //deklarasi object

for( let i = 0; i<total; i++){
  console.log(`\nMahasiswa ${ i }`)
  mahasiswa = {
    firstName : prompt('Input Nama Depan\t\t : '),
    lastName : prompt('Input Nama Belakang\t\t :'),
    fullName : function(){
      return this.firstName + " " + this.lastName
    },
    birth : prompt('Input Tanggal Lahir\t: '),
    nim : prompt('Input Nim\t\t\t: '),
    age : function(){
      let year = this.birth.slice(this.birth.length - 4)
      return 2020 - year
    }
  }

  array.push (mahasiswa)
} 
console.log()

let index = 0

for (let x in array){
  console.log(`\nMahasiswa\t : ${ array[x].fullName() }`)
  console.log(`Tanggal Lahir\t : ${ array[x].birth() }`)
  console.log(`Nim\t\t\t\t : ${ array[x].Nim() }`)
  console.log(`Umur\t\t\t : ${ array[x].age() }`)
}