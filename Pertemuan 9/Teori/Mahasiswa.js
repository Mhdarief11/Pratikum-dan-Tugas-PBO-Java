//deklarasi prompt
const prompt = require('prompt-sync')()
//function
function Mahasiswa(nim, nama, prodi){
    this.nim = nim
    this.nama = nama
    this.prodi = prodi
  
    this. tampil = function(){
      console.log('NIM : ', this.nim)
      console.log('Nama : ', this.nama)
      console.log('Prodi : ', this.prodi)
    }
  }
  
  let jmlMhs = prompt('masukan jumlah mahasiswa : ')

  //array 
  var arrayMhs = []

  //object
  let mhs = {}

  for (let i = 1; i <= jmlMhs; i++){
      console.log(`\nMahasiswa ke-${i}`)

      //object mahasiswa
      mhs = new Mahasiswa(
          prompt('Masukan NIM : '),
          prompt('Masukan Nama : '),
          prompt('Masukan Prodi : ')
      )

      arrayMhs.push(mhs)
  }

  var editData = prompt('Ingin mengubah data ? [ya/tidak] : ')

  if (editData == 'ya') {
    var noMhs = prompt('Masukan nomor urut mahasiswa : ')

    //constructor
    Mahasiswa.prototype.edit = function(){
      nim = prompt('Masukan NIM : '),
      nama = prompt('Masukan Nama : '),
      prodi = prompt('Masukan Prodi : '),
      tampil = this.tampil
      return {nim, nama, prodi, tampil}
    }

    let index = noMhs - 1
    arrayMhs[index] = arrayMhs[index].edit()

    console.log('\nData setelah diubah')
    index = 1

    for (let i in arrayMhs){
      console.log(`\nMahasiswa ke-${index}`)
      index++
      arrayMhs[i].tampil()
    }
  } else if (editData == 'tidak'){
    console.log('\nData setelah diubah')
    index = 1

    for (let i in arrayMhs){
      console.log(`\nMahasiswa ke-${index}`)
      index++
      arrayMhs[i].tampil()
    }
  } else {
    console.log('Pilihan tidak sesuai')
  }